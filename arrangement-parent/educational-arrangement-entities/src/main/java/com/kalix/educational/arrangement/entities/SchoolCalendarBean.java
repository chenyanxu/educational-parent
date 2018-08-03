package com.kalix.educational.arrangement.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.kalix.framework.core.api.persistence.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;

/**
 * 校历实体类
 * @author hqj <br/>
 *         date:2018-8-2
 * @version 1.0.0
 */
@Entity
@Table(name = "edu_arr_school_calendar")
public class SchoolCalendarBean extends PersistentEntity {
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy", timezone = "GMT+8")
    private Date schoolYear;             // 学年
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date firstClassStartDate;    // 第一学期上课起始日期
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date firstClassEndDate;      // 第一学期上课结束日期
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date firstHolidayStartDate;  // 第一学期假期开始日期
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date firstHolidayEndDate;    // 第一学期假期结束日期
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date secondClassStartDate;   // 第二学期上课起始日期
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date secondClassEndDate;     // 第二学期上课结束日期
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date secondHolidayStartDate; // 第一学期假期开始日期
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date secondHolidayEndDate;   // 第一学期假期结束日期

    public Date getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(Date schoolYear) {
        this.schoolYear = schoolYear;
    }

    public Date getFirstClassStartDate() {
        return firstClassStartDate;
    }

    public void setFirstClassStartDate(Date firstClassStartDate) {
        this.firstClassStartDate = firstClassStartDate;
    }

    public Date getFirstClassEndDate() {
        return firstClassEndDate;
    }

    public void setFirstClassEndDate(Date firstClassEndDate) {
        this.firstClassEndDate = firstClassEndDate;
    }

    public Date getFirstHolidayStartDate() {
        return firstHolidayStartDate;
    }

    public void setFirstHolidayStartDate(Date firstHolidayStartDate) {
        this.firstHolidayStartDate = firstHolidayStartDate;
    }

    public Date getFirstHolidayEndDate() {
        return firstHolidayEndDate;
    }

    public void setFirstHolidayEndDate(Date firstHolidayEndDate) {
        this.firstHolidayEndDate = firstHolidayEndDate;
    }

    public Date getSecondClassStartDate() {
        return secondClassStartDate;
    }

    public void setSecondClassStartDate(Date secondClassStartDate) {
        this.secondClassStartDate = secondClassStartDate;
    }

    public Date getSecondClassEndDate() {
        return secondClassEndDate;
    }

    public void setSecondClassEndDate(Date secondClassEndDate) {
        this.secondClassEndDate = secondClassEndDate;
    }

    public Date getSecondHolidayStartDate() {
        return secondHolidayStartDate;
    }

    public void setSecondHolidayStartDate(Date secondHolidayStartDate) {
        this.secondHolidayStartDate = secondHolidayStartDate;
    }

    public Date getSecondHolidayEndDate() {
        return secondHolidayEndDate;
    }

    public void setSecondHolidayEndDate(Date secondHolidayEndDate) {
        this.secondHolidayEndDate = secondHolidayEndDate;
    }
}
