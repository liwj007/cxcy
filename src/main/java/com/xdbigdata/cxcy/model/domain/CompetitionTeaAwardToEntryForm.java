package com.xdbigdata.cxcy.model.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "competition_tea_award_to_entry_form")
public class CompetitionTeaAwardToEntryForm {
    @Column(name = "comp_tea_award_id")
    private Integer compTeaAwardId;

    @Column(name = "entry_form_id")
    private Integer entryFormId;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "create_user_id")
    private Integer createUserId;

    /**
     * @return comp_tea_award_id
     */
    public Integer getCompTeaAwardId() {
        return compTeaAwardId;
    }

    /**
     * @param compTeaAwardId
     */
    public void setCompTeaAwardId(Integer compTeaAwardId) {
        this.compTeaAwardId = compTeaAwardId;
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
        sb.append(", compTeaAwardId=").append(compTeaAwardId);
        sb.append(", entryFormId=").append(entryFormId);
        sb.append(", createDate=").append(createDate);
        sb.append(", createUserId=").append(createUserId);
        sb.append("]");
        return sb.toString();
    }
}