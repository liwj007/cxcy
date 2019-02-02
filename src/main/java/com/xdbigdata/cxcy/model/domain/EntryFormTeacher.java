package com.xdbigdata.cxcy.model.domain;

import javax.persistence.*;

@Table(name = "entry_form_teacher")
public class EntryFormTeacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 参赛表id
     */
    @Column(name = "entry_form_id")
    private Integer entryFormId;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_no")
    private String userNo;

    private String phone;

    private String email;

    /**
     * 职称
     */
    private String title;

    /**
     * 顺位
     */
    private Integer position;

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
     * 获取职称
     *
     * @return title - 职称
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置职称
     *
     * @param title 职称
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取顺位
     *
     * @return position - 顺位
     */
    public Integer getPosition() {
        return position;
    }

    /**
     * 设置顺位
     *
     * @param position 顺位
     */
    public void setPosition(Integer position) {
        this.position = position;
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
        sb.append(", phone=").append(phone);
        sb.append(", email=").append(email);
        sb.append(", title=").append(title);
        sb.append(", position=").append(position);
        sb.append("]");
        return sb.toString();
    }
}