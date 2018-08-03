package com.kalix.educational.arrangement.entities;

import com.kalix.framework.core.api.persistence.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 排课（课程安排）实体类
 *
 * @author hqj <br/>
 *         date:2018-8-3
 * @version 1.0.0
 */
@Entity
@Table(name = "edu_arr_course")
public class CourseArrangementBean extends PersistentEntity {
    private Integer classWeeks = 20;        // 学期上课周数
    private Integer classPerWeekDays = 5;   // 周排课天数，5、6、7
    private Integer classMorningSections;   // 上午日排课节数
    private Integer classAfternoonSections; // 下午日排课节数
    private Integer classEveningSections;   // 晚上日排课节数

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
}
