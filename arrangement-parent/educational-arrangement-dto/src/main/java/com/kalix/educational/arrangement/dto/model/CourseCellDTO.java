package com.kalix.educational.arrangement.dto.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.kalix.framework.core.api.web.model.BaseDTO;

import java.util.Date;

/**
 * 课程表模型类
 *
 * @author hqj date:2018-08-30
 * @version 1.0.0
 */
public class CourseCellDTO extends BaseDTO {
    private Long courseId;        // 课程id
    private String courseName;    // 课程名称
    private Long classRoomId;     // 上课地点id
    private String classRoomName; // 上课地点名称
    private Long teacherId;       // 上课教师id
    private String teacherName;   // 上课教师名称
    private Integer week;         //
    private Integer section;      // 课程节数（第几节课）

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Long getClassRoomId() {
        return classRoomId;
    }

    public void setClassRoomId(Long classRoomId) {
        this.classRoomId = classRoomId;
    }

    public String getClassRoomName() {
        return classRoomName;
    }

    public void setClassRoomName(String classRoomName) {
        this.classRoomName = classRoomName;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Integer getWeek() {
        return week;
    }

    public void setWeek(Integer week) {
        this.week = week;
    }

    public Integer getSection() {
        return section;
    }

    public void setSection(Integer section) {
        this.section = section;
    }
}
