package com.xdbigdata.cxcy.model.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "entry_review")
public class EntryReview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 竞赛id
     */
    @Column(name = "comp_id")
    private Integer compId;

    /**
     * 参赛表id
     */
    @Column(name = "entry_form_id")
    private Integer entryFormId;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "create_user_id")
    private Integer createUserId;

    /**
     * 终审结果：0淘汰，1晋级
     */
    @Column(name = "final_result")
    private Boolean finalResult;

    /**
     * 终审分数
     */
    @Column(name = "final_score")
    private Double finalScore;

    /**
     * 终审意见汇总
     */
    @Column(name = "final_opinion")
    private String finalOpinion;

    /**
     * 作品id
     */
    @Column(name = "comp_entry_id")
    private Integer compEntryId;

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
     * 获取竞赛id
     *
     * @return comp_id - 竞赛id
     */
    public Integer getCompId() {
        return compId;
    }

    /**
     * 设置竞赛id
     *
     * @param compId 竞赛id
     */
    public void setCompId(Integer compId) {
        this.compId = compId;
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
     * 获取终审结果：0淘汰，1晋级
     *
     * @return final_result - 终审结果：0淘汰，1晋级
     */
    public Boolean getFinalResult() {
        return finalResult;
    }

    /**
     * 设置终审结果：0淘汰，1晋级
     *
     * @param finalResult 终审结果：0淘汰，1晋级
     */
    public void setFinalResult(Boolean finalResult) {
        this.finalResult = finalResult;
    }

    /**
     * 获取终审分数
     *
     * @return final_score - 终审分数
     */
    public Double getFinalScore() {
        return finalScore;
    }

    /**
     * 设置终审分数
     *
     * @param finalScore 终审分数
     */
    public void setFinalScore(Double finalScore) {
        this.finalScore = finalScore;
    }

    /**
     * 获取终审意见汇总
     *
     * @return final_opinion - 终审意见汇总
     */
    public String getFinalOpinion() {
        return finalOpinion;
    }

    /**
     * 设置终审意见汇总
     *
     * @param finalOpinion 终审意见汇总
     */
    public void setFinalOpinion(String finalOpinion) {
        this.finalOpinion = finalOpinion;
    }

    /**
     * 获取作品id
     *
     * @return comp_entry_id - 作品id
     */
    public Integer getCompEntryId() {
        return compEntryId;
    }

    /**
     * 设置作品id
     *
     * @param compEntryId 作品id
     */
    public void setCompEntryId(Integer compEntryId) {
        this.compEntryId = compEntryId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", compId=").append(compId);
        sb.append(", entryFormId=").append(entryFormId);
        sb.append(", createDate=").append(createDate);
        sb.append(", createUserId=").append(createUserId);
        sb.append(", finalResult=").append(finalResult);
        sb.append(", finalScore=").append(finalScore);
        sb.append(", finalOpinion=").append(finalOpinion);
        sb.append(", compEntryId=").append(compEntryId);
        sb.append("]");
        return sb.toString();
    }
}