package com.xdbigdata.cxcy.service.impl;

import com.xdbigdata.cxcy.model.vo.StudentVO;
import com.xdbigdata.cxcy.model.vo.TeacherVO;
import org.springframework.stereotype.Service;

import com.xdbigdata.cxcy.mapper.UserMapper;
import com.xdbigdata.cxcy.model.domain.User;
import com.xdbigdata.cxcy.service.UserService;

import lombok.extern.slf4j.Slf4j;
import com.xdbigdata.framework.service.BaseServiceImpl;

import java.util.Date;

/**
 * User service implement
 *
 * @author lshaci
 */
@Service
@Slf4j
public class UserServiceImpl extends BaseServiceImpl<User, UserMapper> implements UserService {


    @Override
    public User login(String userName, String password) {
        User user = new User();
        user.setNo(userName);
        user.setPwd(password);
        User u = getByCondition(user);
        return u;
    }

    @Override
    public StudentVO searchStudent(String no) {
        User example = new User();
        example.setNo(no);
        User user = this.getByCondition(example);

        StudentVO vo = new StudentVO();
        if (user == null) {
            //todo 远程读取学生信息
            User newUser = new User();
            newUser.setNo("");
            newUser.setUsername("");
            newUser.setCollege("");
            newUser.setMajor("");
            newUser.setGrade("");
            newUser.setCreatetime(new Date());
            this.insert(newUser);
            user = newUser;
        }
        vo.setId(user.getId());
        vo.setName(user.getUsername());
        vo.setNo(user.getNo());
        vo.setPhone("");
        vo.setEmail("");
        vo.setCollege(user.getCollege());
        vo.setMajor(user.getMajor());
        return vo;
    }

    @Override
    public TeacherVO searchTeacher(String no) {
        User example = new User();
        example.setNo(no);
        User user = this.getByCondition(example);

        TeacherVO vo = new TeacherVO();

        if (user == null) {
            //todo 远程读取学生信息
            User newUser = new User();
            newUser.setNo("");
            newUser.setUsername("");
            newUser.setCreatetime(new Date());
            this.insert(newUser);
            user = newUser;
        }
        vo.setId(user.getId());
        vo.setName(user.getUsername());
        vo.setNo(user.getNo());
        vo.setPhone("");
        vo.setEmail("");
        return vo;
    }
}
