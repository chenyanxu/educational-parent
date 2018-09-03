package com.kalix.educational.arrangement.biz;

import com.kalix.educational.arrangement.api.biz.ICourseArrangementBeanService;
import com.kalix.educational.arrangement.api.dao.ICourseArrangementBeanDao;
import com.kalix.educational.arrangement.api.dao.ISchoolCalendarBeanDao;
import com.kalix.educational.arrangement.dto.model.CourseCellDTO;
import com.kalix.educational.arrangement.dto.model.CourseTimeTableDTO;
import com.kalix.educational.arrangement.entities.CourseArrangementBean;
import com.kalix.educational.arrangement.entities.SchoolCalendarBean;
import com.kalix.framework.core.impl.biz.ShiroGenericBizServiceImpl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by fj on 2017-8-17.
 */
public class CourseArrangementBeanServiceImpl extends ShiroGenericBizServiceImpl<ICourseArrangementBeanDao, CourseArrangementBean> implements ICourseArrangementBeanService {
    private ISchoolCalendarBeanDao schoolCalendarBeanDao;

    /**
     * 根据当前系统日期，获取课程表信息
     *
     * @param currentDate
     * @return
     */
    @Override
    public CourseTimeTableDTO getCourseTimeTable(String currentDate, Long courseArrangementId) {
        CourseTimeTableDTO rtn = new CourseTimeTableDTO();
        try {
            // 获取排课参数设置
            CourseArrangementBean courseArrangementBean = this.dao.get(courseArrangementId);
            rtn.setClassWeeks(courseArrangementBean.getClassWeeks());
            rtn.setClassPerWeekDays(Integer.parseInt(courseArrangementBean.getClassPerWeekDays()));
            rtn.setClassMorningSections(Integer.parseInt(courseArrangementBean.getClassMorningSections()));
            rtn.setClassAfternoonSections(Integer.parseInt(courseArrangementBean.getClassAfternoonSections()));
            rtn.setClassEveningSections(Integer.parseInt(courseArrangementBean.getClassEveningSections()));
            // 获取校历参数设置(课程表学年学期参数)
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sdf.parse(currentDate);
            String sql = "select c.* from edu_arr_school_calendar c where c.firstclassstartdate <= ?1 and c.firstholidayenddate >= ?1";
            List<SchoolCalendarBean> list1 = schoolCalendarBeanDao.findByNativeSql(sql, SchoolCalendarBean.class, date);
            if (list1 != null && list1.size() > 0) {
                rtn.setSchoolYear(list1.get(0).getSchoolYear());
                rtn.setTerm(1);
                rtn.setStartDate(list1.get(0).getFirstClassStartDate());
                long week = (date.getTime() - list1.get(0).getFirstClassStartDate().getTime()) / 86400000 / 7 + 1;
                // 判断如果周数大于排课参数周数，认为是放假中，设置为0
                if (week > courseArrangementBean.getClassWeeks()) {
                    week = 0;
                }
                rtn.setWeek((int) week);
            } else {
                sql = "select c.* from edu_arr_school_calendar c where c.secondclassstartdate <= ?1 and c.secondholidayenddate >= ?1";
                List<SchoolCalendarBean> list2 = schoolCalendarBeanDao.findByNativeSql(sql, SchoolCalendarBean.class, date);
                if (list2 != null && list2.size() > 0) {
                    rtn.setSchoolYear(list2.get(0).getSchoolYear());
                    rtn.setTerm(2);
                    rtn.setStartDate(list2.get(0).getSecondClassStartDate());
                    long week = (date.getTime() - list2.get(0).getSecondClassStartDate().getTime()) / 86400000 / 7 + 1;
                    // 判断如果周数大于排课参数周数，认为是放假中，设置为0
                    if (week > courseArrangementBean.getClassWeeks()) {
                        week = 0;
                    }
                    rtn.setWeek((int) week);
                } else {
                    rtn.setSuccess(false);
                    rtn.setMsg("未设置校历信息，获取课程表失败！");
                    return rtn;
                }
            }
            // 获取课程信息
            List<CourseCellDTO> course = new ArrayList<CourseCellDTO>();
            CourseCellDTO courseCellDTO = new CourseCellDTO();
            courseCellDTO.setCourseName("测试课程1");
            courseCellDTO.setClassRoomName("F101");
            courseCellDTO.setTeacherName("测试教师1");
            courseCellDTO.setWeek(1);
            courseCellDTO.setSection(1);
            course.add(courseCellDTO);
            rtn.setCourse(course);

            rtn.setSuccess(true);
            return rtn;
        } catch (ParseException e) {
            rtn.setSuccess(false);
            rtn.setMsg(e.getMessage());
            e.printStackTrace();
            return rtn;
        } catch (Exception e) {
            rtn.setSuccess(false);
            rtn.setMsg(e.getMessage());
            e.printStackTrace();
            return rtn;
        }
    }

    public void setSchoolCalendarBeanDao(ISchoolCalendarBeanDao schoolCalendarBeanDao) {
        this.schoolCalendarBeanDao = schoolCalendarBeanDao;
    }
}
