package com.xdbigdata.cxcy.model.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "entry_review_opinion")
public class EntryReviewOpinion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 评委姓名
     */
    @Column(name = "judge_name")
    private String judgeName;

    /**
     * 分数
     */
    private Double score;

    /**
     * 评价
     */
    private String opinion;

    /**
     * 录入时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 录入人
     */
    @Column(name = "create_user_id")
    private Integer createUserId;

    /**
     * 评审id
     */
    @Column(name = "entry_review_id")
    private Integer entryReviewId;

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
     * 获取评委姓名
     *
     * @return judge_name - 评委姓名
     */
    public String getJudgeName() {
        return judgeName;
    }

    /**
     * 设置评委姓名
     *
     * @param judgeName 评委姓名
     */
    public void setJudgeName(String judgeName) {
        this.judgeName = judgeName;
    }

    /**
     * 获取分数
     *
     * @return score - 分数
     */
    public Double getScore() {
        return score;
    }

    /**
     * 设置分数
     *
     * @param score 分数
     */
    public void setScore(Double score) {
        this.score = score;
    }

    /**
     * 获取评价
     *
     * @return opinion - 评价
     */
    public String getOpinion() {
        return opinion;
    }

    /**
     * 设置评价
     *
     * @param opinion 评价
     */
    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    /**
     * 获取录入时间
     *
     * @return create_time - 录入时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置录入时间
     *
     * @param createTime 录入时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取录入人
     *
     * @return create_user_id - 录入人
     */
    public Integer getCreateUserId() {
        return createUserId;
    }

    /**
     * 设置录入人
     *
     * @param createUserId 录入人
     */
    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * 获取评审id
     *
     * @return entry_review_id - 评审id
     */
    public Integer getEntryReviewId() {
        return entryReviewId;
    }

    /**
     * 设置评审id
     *
     * @param entryReviewId 评审id
     */
    public void setEntryReviewId(Integer entryReviewId) {
        this.entryReviewId = entryReviewId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", judgeName=").append(judgeName);
        sb.append(", score=").append(score);
        sb.append(", opinion=").append(opinion);
        sb.append(", createTime=").append(createTime);
        sb.append(", createUserId=").append(createUserId);
        sb.append(", entryReviewId=").append(entryReviewId);
        sb.append("]");
        return sb.toString();
    }
}