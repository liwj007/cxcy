package com.xdbigdata.cxcy.model.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "forum_reply")
public class ForumReply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "post_id")
    private Integer postId;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "create_user_id")
    private Integer createUserId;

    private String content;

    /**
     * 点赞数
     */
    @Column(name = "like_cnt")
    private Integer likeCnt;

    @Column(name = "for_reply_id")
    private Integer forReplyId;

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
     * @return post_id
     */
    public Integer getPostId() {
        return postId;
    }

    /**
     * @param postId
     */
    public void setPostId(Integer postId) {
        this.postId = postId;
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
     * 获取点赞数
     *
     * @return like_cnt - 点赞数
     */
    public Integer getLikeCnt() {
        return likeCnt;
    }

    /**
     * 设置点赞数
     *
     * @param likeCnt 点赞数
     */
    public void setLikeCnt(Integer likeCnt) {
        this.likeCnt = likeCnt;
    }

    /**
     * @return for_reply_id
     */
    public Integer getForReplyId() {
        return forReplyId;
    }

    /**
     * @param forReplyId
     */
    public void setForReplyId(Integer forReplyId) {
        this.forReplyId = forReplyId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", postId=").append(postId);
        sb.append(", createDate=").append(createDate);
        sb.append(", createUserId=").append(createUserId);
        sb.append(", content=").append(content);
        sb.append(", likeCnt=").append(likeCnt);
        sb.append(", forReplyId=").append(forReplyId);
        sb.append("]");
        return sb.toString();
    }
}