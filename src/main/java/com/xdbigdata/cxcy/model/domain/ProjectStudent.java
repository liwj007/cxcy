package com.xdbigdata.cxcy.model.domain;

import javax.persistence.*;

@Table(name = "project_student")
public class ProjectStudent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "user_no")
    private Integer userNo;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "college_name")
    private String collegeName;

    @Column(name = "major_name")
    private String majorName;

    private String phone;

    private String email;

    @Column(name = "project_id")
    private Integer projectId;

    /**
     * 0负责人，1成员
     */
    private Boolean identity;

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
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return user_no
     */
    public Integer getUserNo() {
        return userNo;
    }

    /**
     * @param userNo
     */
    public void setUserNo(Integer userNo) {
        this.userNo = userNo;
    }

    /**
     * @return user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return college_name
     */
    public String getCollegeName() {
        return collegeName;
    }

    /**
     * @param collegeName
     */
    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    /**
     * @return major_name
     */
    public String getMajorName() {
        return majorName;
    }

    /**
     * @param majorName
     */
    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return project_id
     */
    public Integer getProjectId() {
        return projectId;
    }

    /**
     * @param projectId
     */
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    /**
     * 获取0负责人，1成员
     *
     * @return identity - 0负责人，1成员
     */
    public Boolean getIdentity() {
        return identity;
    }

    /**
     * 设置0负责人，1成员
     *
     * @param identity 0负责人，1成员
     */
    public void setIdentity(Boolean identity) {
        this.identity = identity;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", userNo=").append(userNo);
        sb.append(", userName=").append(userName);
        sb.append(", collegeName=").append(collegeName);
        sb.append(", majorName=").append(majorName);
        sb.append(", phone=").append(phone);
        sb.append(", email=").append(email);
        sb.append(", projectId=").append(projectId);
        sb.append(", identity=").append(identity);
        sb.append("]");
        return sb.toString();
    }
}