package com.xdbigdata.cxcy.model.domain;

import javax.persistence.*;

@Table(name = "entry_form_student")
public class EntryFormStudent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 参赛表id
     */
    @Column(name = "entry_form_id")
    private Integer entryFormId;

    /**
     * 参赛人id
     */
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_no")
    private String userNo;

    @Column(name = "user_college")
    private String userCollege;

    @Column(name = "user_major")
    private String userMajor;

    private String phone;

    private String email;

    /**
     * 身份:0负责人，1成员
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
     * 获取参赛表id
     *
     * @return entry_form_id - 参赛表id
     */
    public Integer getEntryFormId() {
        return entryFormId;
    }

    /**
     * 设置参赛表id
     *
     * @param entryFormId 参赛表id
     */
    public void setEntryFormId(Integer entryFormId) {
        this.entryFormId = entryFormId;
    }

    /**
     * 获取参赛人id
     *
     * @return user_id - 参赛人id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置参赛人id
     *
     * @param userId 参赛人id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
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
     * @return user_no
     */
    public String getUserNo() {
        return userNo;
    }

    /**
     * @param userNo
     */
    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    /**
     * @return user_college
     */
    public String getUserCollege() {
        return userCollege;
    }

    /**
     * @param userCollege
     */
    public void setUserCollege(String userCollege) {
        this.userCollege = userCollege;
    }

    /**
     * @return user_major
     */
    public String getUserMajor() {
        return userMajor;
    }

    /**
     * @param userMajor
     */
    public void setUserMajor(String userMajor) {
        this.userMajor = userMajor;
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
     * 获取身份:0负责人，1成员
     *
     * @return identity - 身份:0负责人，1成员
     */
    public Boolean getIdentity() {
        return identity;
    }

    /**
     * 设置身份:0负责人，1成员
     *
     * @param identity 身份:0负责人，1成员
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
        sb.append(", entryFormId=").append(entryFormId);
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", userNo=").append(userNo);
        sb.append(", userCollege=").append(userCollege);
        sb.append(", userMajor=").append(userMajor);
        sb.append(", phone=").append(phone);
        sb.append(", email=").append(email);
        sb.append(", identity=").append(identity);
        sb.append("]");
        return sb.toString();
    }
}