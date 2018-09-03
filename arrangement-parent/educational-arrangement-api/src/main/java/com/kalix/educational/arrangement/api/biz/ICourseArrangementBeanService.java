package com.kalix.educational.arrangement.api.biz;

import com.kalix.educational.arrangement.dto.model.CourseTimeTableDTO;
import com.kalix.educational.arrangement.entities.CourseArrangementBean;
import com.kalix.framework.core.api.biz.IBizService;

/**
 * Created by dell on 14-1-17.
 */
public interface ICourseArrangementBeanService extends IBizService<CourseArrangementBean> {

    /**
     * 根据当前系统日期，获取课程表信息
     *
     * @param currentDate
     * @return
     */
    CourseTimeTableDTO getCourseTimeTable(String currentDate, Long courseArrangementId);
}
