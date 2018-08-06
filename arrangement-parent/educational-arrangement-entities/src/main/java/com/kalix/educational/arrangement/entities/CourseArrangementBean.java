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
@Table(name = "edu_arr_course_arrangement")
public class CourseArrangementBean extends PersistentEntity {
    private Integer classWeeks = 20;       // 学期上课周数
    private String classPerWeekDays = "5"; // 周排课天数，5、6、7
    private String classMorningSections;   // 上午日排课节数
    private String classAfternoonSections; // 下午日排课节数
    private String classEveningSections;   // 晚上日排课节数

    public Integer getClassWeeks() {
        return classWeeks;
    }

    public void setClassWeeks(Integer classWeeks) {
        this.classWeeks = classWeeks;
    }

    public String getClassPerWeekDays() {
        return classPerWeekDays;
    }

    public void setClassPerWeekDays(String classPerWeekDays) {
        this.classPerWeekDays = classPerWeekDays;
    }

    public String getClassMorningSections() {
        return classMorningSections;
    }

    public void setClassMorningSections(String classMorningSections) {
        this.classMorningSections = classMorningSections;
    }

    public String getClassAfternoonSections() {
        return classAfternoonSections;
    }

    public void setClassAfternoonSections(String classAfternoonSections) {
        this.classAfternoonSections = classAfternoonSections;
    }

    public String getClassEveningSections() {
        return classEveningSections;
    }

    public void setClassEveningSections(String classEveningSections) {
        this.classEveningSections = classEveningSections;
    }
}
