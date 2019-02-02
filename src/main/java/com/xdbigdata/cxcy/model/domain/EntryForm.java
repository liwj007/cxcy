package com.xdbigdata.cxcy.model.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "entry_form")
public class EntryForm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 竞赛id
     */
    @Column(name = "comp_id")
    private Integer compId;

    /**
     * 报名时间
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 报名用户id
     */
    @Column(name = "create_user_id")
    private Integer createUserId;

    /**
     * 报名理由
     */
    private String reason;

    /**
     * 报名状态
     */
    @Column(name = "enroll_status")
    private Integer enrollStatus;

    /**
     * 审核意见
     */
    @Column(name = "check_opinion")
    private String checkOpinion;

    /**
     * 审核时间
     */
    @Column(name = "check_date")
    private Date checkDate;

    /**
     * 审核操作人
     */
    @Column(name = "check_user_id")
    private Integer checkUserId;

    /**
     * 审核操作人姓名
     */
    @Column(name = "check_user_name")
    private String checkUserName;

    /**
     * 审核操作人工号
     */
    @Column(name = "check_user_no")
    private String checkUserNo;

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
     * 获取报名时间
     *
     * @return create_date - 报名时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置报名时间
     *
     * @param createDate 报名时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取报名用户id
     *
     * @return create_user_id - 报名用户id
     */
    public Integer getCreateUserId() {
        return createUserId;
    }

    /**
     * 设置报名用户id
     *
     * @param createUserId 报名用户id
     */
    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * 获取报名理由
     *
     * @return reason - 报名理由
     */
    public String getReason() {
        return reason;
    }

    /**
     * 设置报名理由
     *
     * @param reason 报名理由
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * 获取报名状态
     *
     * @return enroll_status - 报名状态
     */
    public Integer getEnrollStatus() {
        return enrollStatus;
    }

    /**
     * 设置报名状态
     *
     * @param enrollStatus 报名状态
     */
    public void setEnrollStatus(Integer enrollStatus) {
        this.enrollStatus = enrollStatus;
    }

    /**
     * 获取审核意见
     *
     * @return check_opinion - 审核意见
     */
    public String getCheckOpinion() {
        return checkOpinion;
    }

    /**
     * 设置审核意见
     *
     * @param checkOpinion 审核意见
     */
    public void setCheckOpinion(String checkOpinion) {
        this.checkOpinion = checkOpinion;
    }

    /**
     * 获取审核时间
     *
     * @return check_date - 审核时间
     */
    public Date getCheckDate() {
        return checkDate;
    }

    /**
     * 设置审核时间
     *
     * @param checkDate 审核时间
     */
    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }

    /**
     * 获取审核操作人
     *
     * @return check_user_id - 审核操作人
     */
    public Integer getCheckUserId() {
        return checkUserId;
    }

    /**
     * 设置审核操作人
     *
     * @param checkUserId 审核操作人
     */
    public void setCheckUserId(Integer checkUserId) {
        this.checkUserId = checkUserId;
    }

    /**
     * 获取审核操作人姓名
     *
     * @return check_user_name - 审核操作人姓名
     */
    public String getCheckUserName() {
        return checkUserName;
    }

    /**
     * 设置审核操作人姓名
     *
     * @param checkUserName 审核操作人姓名
     */
    public void setCheckUserName(String checkUserName) {
        this.checkUserName = checkUserName;
    }

    /**
     * 获取审核操作人工号
     *
     * @return check_user_no - 审核操作人工号
     */
    public String getCheckUserNo() {
        return checkUserNo;
    }

    /**
     * 设置审核操作人工号
     *
     * @param checkUserNo 审核操作人工号
     */
    public void setCheckUserNo(String checkUserNo) {
        this.checkUserNo = checkUserNo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", compId=").append(compId);
        sb.append(", createDate=").append(createDate);
        sb.append(", createUserId=").append(createUserId);
        sb.append(", reason=").append(reason);
        sb.append(", enrollStatus=").append(enrollStatus);
        sb.append(", checkOpinion=").append(checkOpinion);
        sb.append(", checkDate=").append(checkDate);
        sb.append(", checkUserId=").append(checkUserId);
        sb.append(", checkUserName=").append(checkUserName);
        sb.append(", checkUserNo=").append(checkUserNo);
        sb.append("]");
        return sb.toString();
    }
}