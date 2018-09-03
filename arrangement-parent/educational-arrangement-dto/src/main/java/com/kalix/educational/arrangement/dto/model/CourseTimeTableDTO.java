package com.kalix.educational.arrangement.dto.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.kalix.framework.core.api.web.model.BaseDTO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 课程表模型类
 *
 * @author hqj date:2018-08-30
 * @version 1.0.0
 */
public class CourseTimeTableDTO extends BaseDTO {
    private Boolean success = false; // 查询是否成功
    private String msg;              // 查询失败原因
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy", timezone = "GMT+8")
    private Date schoolYear; // 学年
    private Integer term;    // 学期,1或2
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date startDate;  // 上课开始时间（周一）
    private Integer week;    // 当前周数

    private Integer classWeeks = 20;        // 学期上课周数
    private Integer classPerWeekDays = 5;   // 周排课天数，5、6、7
    private Integer classMorningSections;   // 上午日排课节数
    private Integer classAfternoonSections; // 下午日排课节数
    private Integer classEveningSections;   // 晚上日排课节数

    private List<CourseCellDTO> course = new ArrayList<CourseCellDTO>();

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Date getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(Date schoolYear) {
        this.schoolYear = schoolYear;
    }

    public Integer getTerm() {
        return term;
    }

    public void setTerm(Integer term) {
        this.term = term;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Integer getWeek() {
        return week;
    }

    public void setWeek(Integer week) {
        this.week = week;
    }

    public Integer getClassWeeks() {
        return classWeeks;
    }

    public void setClassWeeks(Integer classWeeks) {
        this.classWeeks = classWeeks;
    }

    public Integer getClassPerWeekDays() {
        return classPerWeekDays;
    }

    public void setClassPerWeekDays(Integer classPerWeekDays) {
        this.classPerWeekDays = classPerWeekDays;
    }

    public Integer getClassMorningSections() {
        return classMorningSections;
    }

    public void setClassMorningSections(Integer classMorningSections) {
        this.classMorningSections = classMorningSections;
    }

    public Integer getClassAfternoonSections() {
        return classAfternoonSections;
    }

    public void setClassAfternoonSections(Integer classAfternoonSections) {
        this.classAfternoonSections = classAfternoonSections;
    }

    public Integer getClassEveningSections() {
        return classEveningSections;
    }

    public void setClassEveningSections(Integer classEveningSections) {
        this.classEveningSections = classEveningSections;
    }

    public List<CourseCellDTO> getCourse() {
        return course;
    }

    public void setCourse(List<CourseCellDTO> course) {
        this.course = course;
    }
}
