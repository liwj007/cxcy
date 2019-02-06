package com.xdbigdata.cxcy.model.vo;

import java.util.List;

public class EntryFormVO {
    public List<StudentVO> students;
    public List<TeacherVO> teachers;
    public String reason;
    public Integer compId;


    public Integer getCompId() {
        return compId;
    }

    public void setCompId(Integer compId) {
        this.compId = compId;
    }

    public List<StudentVO> getStudents() {
        return students;
    }

    public void setStudents(List<StudentVO> students) {
        this.students = students;
    }

    public List<TeacherVO> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<TeacherVO> teachers) {
        this.teachers = teachers;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
