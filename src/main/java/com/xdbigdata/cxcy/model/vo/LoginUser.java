package com.xdbigdata.cxcy.model.vo;

import com.xdbigdata.cxcy.constant.UserIdentity;
import com.xdbigdata.cxcy.model.domain.User;

public class LoginUser {
    public Integer id;
    public String name;
    public String identity;
    public String no;
    public String college;
    public String major;
    public String grade;
    public String pic;

    public LoginUser(User user) {
        this.id=user.getId();
        this.name=user.getUsername();
        this.no=user.getNo();
        this.identity=user.getIdentity();
        if (user.getIdentity().equals(UserIdentity.USER_IDENTITY_STUDENT)){
            this.college=user.getCollege();
            this.major=user.getMajor();
            this.grade=user.getGrade();
        }
        if ((user.getIdentity().equals(UserIdentity.USER_IDENTITY_COLLEGE))){
            this.college=user.getCollege();
        }
        this.pic=user.getPic();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }
}
