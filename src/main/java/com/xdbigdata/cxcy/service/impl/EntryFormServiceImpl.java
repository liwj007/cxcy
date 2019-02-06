package com.xdbigdata.cxcy.service.impl;

import com.xdbigdata.cxcy.constant.Constant;
import com.xdbigdata.cxcy.model.domain.EntryFormStudent;
import com.xdbigdata.cxcy.model.domain.EntryFormTeacher;
import com.xdbigdata.cxcy.model.domain.User;
import com.xdbigdata.cxcy.model.vo.EntryFormVO;
import com.xdbigdata.cxcy.model.vo.StudentVO;
import com.xdbigdata.cxcy.model.vo.TeacherVO;
import com.xdbigdata.cxcy.service.EntryFormStudentService;
import com.xdbigdata.cxcy.service.EntryFormTeacherService;
import com.xdbigdata.framework.web.utils.SessionUserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xdbigdata.cxcy.mapper.EntryFormMapper;
import com.xdbigdata.cxcy.model.domain.EntryForm;
import com.xdbigdata.cxcy.service.EntryFormService;

import lombok.extern.slf4j.Slf4j;
import com.xdbigdata.framework.service.BaseServiceImpl;

import java.util.Date;

/**
 * EntryForm service implement
 *
 * @author lshaci
 */
@Service
@Slf4j
public class EntryFormServiceImpl extends BaseServiceImpl<EntryForm, EntryFormMapper> implements EntryFormService {
    @Autowired
    public EntryFormStudentService studentService;

    @Autowired
    public EntryFormTeacherService teacherService;

    @Override
    public void entry(EntryFormVO entryFormVO) {
        User u = SessionUserUtils.getUserInSession(User.class);

        EntryForm entryForm = new EntryForm();
        entryForm.setCompId(entryFormVO.getCompId());
        entryForm.setEnrollStatus(Constant.ENTRY_APPLY);
        entryForm.setCreateDate(new Date());
        entryForm.setCreateUserId(u.getId());
        entryForm.setReason(entryFormVO.getReason());
        this.insert(entryForm);

        EntryFormStudent student = new EntryFormStudent();
        student.setEmail("");
        student.setPhone("");
        student.setEntryFormId(entryForm.getId());
        student.setUserId(u.getId());
        student.setUserName(u.getUsername());
        student.setUserNo(u.getNo());
        student.setUserCollege(u.getCollege());
        student.setUserMajor(u.getMajor());
        student.setIdentity(Constant.LEADER);
        studentService.insert(student);


        for (StudentVO studentVO : entryFormVO.getStudents()) {
            student = new EntryFormStudent();
            student.setEmail(studentVO.getEmail());
            student.setPhone(studentVO.getPhone());
            student.setEntryFormId(entryForm.getId());
            student.setUserId(studentVO.getId());
            student.setUserName(studentVO.getName());
            student.setUserNo(studentVO.getNo());
            student.setUserCollege(studentVO.getCollege());
            student.setUserMajor(studentVO.getMajor());
            student.setIdentity(Constant.MEMBER);
            studentService.insert(student);
        }

        int i = 1;
        for (TeacherVO teacherVO : entryFormVO.getTeachers()) {
            EntryFormTeacher teacher = new EntryFormTeacher();
            teacher.setUserId(teacherVO.getId());
            teacher.setUserName(teacherVO.getName());
            teacher.setUserNo(teacherVO.getNo());
            teacher.setPhone(teacherVO.getPhone());
            teacher.setEmail(teacherVO.getEmail());
            teacher.setTitle(teacherVO.getTitle());
            teacher.setEntryFormId(entryForm.getId());
            teacher.setPosition(i);
            teacherService.insert(teacher);
            i++;
        }

    }

    @Override
    public void check(Integer id, String res, String opinion) {
        EntryForm entryForm = this.get(id);
        if (entryForm==null||entryForm.getEnrollStatus()!=Constant.ENTRY_APPLY){
            return;
        }
        if (res.equals("pass")){
            entryForm.setEnrollStatus(Constant.ENTRY_PASS);
        }else if (res.equals("fail")){
            entryForm.setEnrollStatus(Constant.ENTRY_UNPASS);
        }
        entryForm.setCheckDate(new Date());
        User u = SessionUserUtils.getUserInSession(User.class);
        entryForm.setCheckUserId(u.getId());
        entryForm.setCheckUserName(u.getUsername());
        entryForm.setCheckUserNo(u.getNo());
        entryForm.setCheckOpinion(opinion);

        this.update(entryForm);
    }
}
