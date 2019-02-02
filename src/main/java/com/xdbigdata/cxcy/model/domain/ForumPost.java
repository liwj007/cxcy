package com.xdbigdata.cxcy.model.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "forum_post")
public class ForumPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String content;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "create_user_id")
    private Integer createUserId;

    /**
     * 回应数
     */
    @Column(name = "apply_cnt")
    private Integer applyCnt;

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
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
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
     * @return create_date
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * @return create_user_id
     */
    public Integer getCreateUserId() {
        return createUserId;
    }

    /**
     * @param createUserId
     */
    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * 获取回应数
     *
     * @return apply_cnt - 回应数
     */
    public Integer getApplyCnt() {
        return applyCnt;
    }

    /**
     * 设置回应数
     *
     * @param applyCnt 回应数
     */
    public void setApplyCnt(Integer applyCnt) {
        this.applyCnt = applyCnt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", content=").append(content);
        sb.append(", createDate=").append(createDate);
        sb.append(", createUserId=").append(createUserId);
        sb.append(", applyCnt=").append(applyCnt);
        sb.append("]");
        return sb.toString();
    }
}