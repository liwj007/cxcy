package com.xdbigdata.cxcy.model.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "competition_stu_award_to_entry_form")
public class CompetitionStuAwardToEntryForm {
    @Id
    @Column(name = "comp_stu_award_id")
    private Integer compStuAwardId;

    @Id
    @Column(name = "entry_form_id")
    private Integer entryFormId;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "create_user_id")
    private Integer createUserId;

    /**
     * @return comp_stu_award_id
     */
    public Integer getCompStuAwardId() {
        return compStuAwardId;
    }

    /**
     * @param compStuAwardId
     */
    public void setCompStuAwardId(Integer compStuAwardId) {
        this.compStuAwardId = compStuAwardId;
    }

    /**
     * @return entry_form_id
     */
    public Integer getEntryFormId() {
        return entryFormId;
    }

    /**
     * @param entryFormId
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", compStuAwardId=").append(compStuAwardId);
        sb.append(", entryFormId=").append(entryFormId);
        sb.append(", createDate=").append(createDate);
        sb.append(", createUserId=").append(createUserId);
        sb.append("]");
        return sb.toString();
    }
}