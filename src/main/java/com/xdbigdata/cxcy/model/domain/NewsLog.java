package com.xdbigdata.cxcy.model.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "news_log")
public class NewsLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String action;

    @Column(name = "action_date")
    private Date actionDate;

    private String content;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_no")
    private String userNo;

    private String section;

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
     * @return action
     */
    public String getAction() {
        return action;
    }

    /**
     * @param action
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * @return action_date
     */
    public Date getActionDate() {
        return actionDate;
    }

    /**
     * @param actionDate
     */
    public void setActionDate(Date actionDate) {
        this.actionDate = actionDate;
    }

    /**
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
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
     * @return section
     */
    public String getSection() {
        return section;
    }

    /**
     * @param section
     */
    public void setSection(String section) {
        this.section = section;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", action=").append(action);
        sb.append(", actionDate=").append(actionDate);
        sb.append(", content=").append(content);
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", userNo=").append(userNo);
        sb.append(", section=").append(section);
        sb.append("]");
        return sb.toString();
    }
}