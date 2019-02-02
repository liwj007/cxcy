package com.xdbigdata.cxcy.model.domain;

import java.util.Date;
import javax.persistence.*;

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 姓名
     */
    private String username;

    /**
     * 工号/学好
     */
    private String no;

    /**
     * 密码
     */
    private String pwd;

    private Date logintime;

    private Date createtime;

    /**
     * 头像
     */
    private String pic;

    /**
     * 授权码
     */
    private String token;

    /**
     * 授权码到期时间戳
     */
    private Integer expire;

    /**
     * 学院
     */
    private String college;

    /**
     * 专业
     */
    private String major;

    /**
     * 年级
     */
    private String grade;

    /**
     * 身份：学院用户/学校用户
     */
    private String identity;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取姓名
     *
     * @return username - 姓名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置姓名
     *
     * @param username 姓名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取工号/学好
     *
     * @return no - 工号/学好
     */
    public String getNo() {
        return no;
    }

    /**
     * 设置工号/学好
     *
     * @param no 工号/学好
     */
    public void setNo(String no) {
        this.no = no;
    }

    /**
     * 获取密码
     *
     * @return pwd - 密码
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * 设置密码
     *
     * @param pwd 密码
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    /**
     * @return logintime
     */
    public Date getLogintime() {
        return logintime;
    }

    /**
     * @param logintime
     */
    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

    /**
     * @return createtime
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * @param createtime
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取头像
     *
     * @return pic - 头像
     */
    public String getPic() {
        return pic;
    }

    /**
     * 设置头像
     *
     * @param pic 头像
     */
    public void setPic(String pic) {
        this.pic = pic;
    }

    /**
     * 获取授权码
     *
     * @return token - 授权码
     */
    public String getToken() {
        return token;
    }

    /**
     * 设置授权码
     *
     * @param token 授权码
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * 获取授权码到期时间戳
     *
     * @return expire - 授权码到期时间戳
     */
    public Integer getExpire() {
        return expire;
    }

    /**
     * 设置授权码到期时间戳
     *
     * @param expire 授权码到期时间戳
     */
    public void setExpire(Integer expire) {
        this.expire = expire;
    }

    /**
     * 获取学院
     *
     * @return college - 学院
     */
    public String getCollege() {
        return college;
    }

    /**
     * 设置学院
     *
     * @param college 学院
     */
    public void setCollege(String college) {
        this.college = college;
    }

    /**
     * 获取专业
     *
     * @return major - 专业
     */
    public String getMajor() {
        return major;
    }

    /**
     * 设置专业
     *
     * @param major 专业
     */
    public void setMajor(String major) {
        this.major = major;
    }

    /**
     * 获取年级
     *
     * @return grade - 年级
     */
    public String getGrade() {
        return grade;
    }

    /**
     * 设置年级
     *
     * @param grade 年级
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * 获取身份：学院用户/学校用户
     *
     * @return identity - 身份：学院用户/学校用户
     */
    public String getIdentity() {
        return identity;
    }

    /**
     * 设置身份：学院用户/学校用户
     *
     * @param identity 身份：学院用户/学校用户
     */
    public void setIdentity(String identity) {
        this.identity = identity;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", no=").append(no);
        sb.append(", pwd=").append(pwd);
        sb.append(", logintime=").append(logintime);
        sb.append(", createtime=").append(createtime);
        sb.append(", pic=").append(pic);
        sb.append(", token=").append(token);
        sb.append(", expire=").append(expire);
        sb.append(", college=").append(college);
        sb.append(", major=").append(major);
        sb.append(", grade=").append(grade);
        sb.append(", identity=").append(identity);
        sb.append("]");
        return sb.toString();
    }
}