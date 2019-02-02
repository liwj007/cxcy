package com.xdbigdata.cxcy.model.domain;

import java.util.Date;
import javax.persistence.*;

public class Competition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 名称
     */
    private String title;

    /**
     * 竞赛类型
     */
    @Column(name = "comp_type_id")
    private Integer compTypeId;

    /**
     * 竞赛级别
     */
    @Column(name = "comp_level_id")
    private Integer compLevelId;

    /**
     * 竞赛类别
     */
    @Column(name = "comp_category_id")
    private Integer compCategoryId;

    /**
     * 形式:0团队，1个人
     */
    private Boolean form;

    /**
     * 人数上限
     */
    @Column(name = "upper_limit")
    private Integer upperLimit;

    /**
     * 主办单位
     */
    private String unit;

    /**
     * 报名开始时间
     */
    @Column(name = "enroll_begin_date")
    private Date enrollBeginDate;

    /**
     * 报名结束时间
     */
    @Column(name = "enroll_end_date")
    private Date enrollEndDate;

    /**
     * 比赛开始时间
     */
    @Column(name = "comp_begin_date")
    private Date compBeginDate;

    /**
     * 比赛结束时间
     */
    @Column(name = "comp_end_date")
    private Date compEndDate;

    /**
     * 比赛地址
     */
    private String address;

    /**
     * 发布状态
     */
    @Column(name = "publish_status")
    private Integer publishStatus;

    /**
     * 发布时间
     */
    @Column(name = "publish_date")
    private Date publishDate;

    /**
     * 审核状态
     */
    @Column(name = "check_status")
    private Integer checkStatus;

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
     * 审核时间
     */
    @Column(name = "check_date")
    private Date checkDate;

    /**
     * 审核意见
     */
    @Column(name = "check_opinion")
    private String checkOpinion;

    /**
     * 创建人id
     */
    @Column(name = "create_user_id")
    private Integer createUserId;

    /**
     * 创建时间
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 创建类型：0学院，1学校
     */
    @Column(name = "create_type")
    private Boolean createType;

    /**
     * 创建学院
     */
    @Column(name = "create_college")
    private String createCollege;

    /**
     * 总结时间
     */
    @Column(name = "summary_date")
    private Date summaryDate;

    /**
     * 总结录入人
     */
    @Column(name = "summary_user_id")
    private Integer summaryUserId;

    /**
     * 竞赛总结
     */
    private String summary;

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
     * 获取名称
     *
     * @return title - 名称
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置名称
     *
     * @param title 名称
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取竞赛类型
     *
     * @return comp_type_id - 竞赛类型
     */
    public Integer getCompTypeId() {
        return compTypeId;
    }

    /**
     * 设置竞赛类型
     *
     * @param compTypeId 竞赛类型
     */
    public void setCompTypeId(Integer compTypeId) {
        this.compTypeId = compTypeId;
    }

    /**
     * 获取竞赛级别
     *
     * @return comp_level_id - 竞赛级别
     */
    public Integer getCompLevelId() {
        return compLevelId;
    }

    /**
     * 设置竞赛级别
     *
     * @param compLevelId 竞赛级别
     */
    public void setCompLevelId(Integer compLevelId) {
        this.compLevelId = compLevelId;
    }

    /**
     * 获取竞赛类别
     *
     * @return comp_category_id - 竞赛类别
     */
    public Integer getCompCategoryId() {
        return compCategoryId;
    }

    /**
     * 设置竞赛类别
     *
     * @param compCategoryId 竞赛类别
     */
    public void setCompCategoryId(Integer compCategoryId) {
        this.compCategoryId = compCategoryId;
    }

    /**
     * 获取形式:0团队，1个人
     *
     * @return form - 形式:0团队，1个人
     */
    public Boolean getForm() {
        return form;
    }

    /**
     * 设置形式:0团队，1个人
     *
     * @param form 形式:0团队，1个人
     */
    public void setForm(Boolean form) {
        this.form = form;
    }

    /**
     * 获取人数上限
     *
     * @return upper_limit - 人数上限
     */
    public Integer getUpperLimit() {
        return upperLimit;
    }

    /**
     * 设置人数上限
     *
     * @param upperLimit 人数上限
     */
    public void setUpperLimit(Integer upperLimit) {
        this.upperLimit = upperLimit;
    }

    /**
     * 获取主办单位
     *
     * @return unit - 主办单位
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 设置主办单位
     *
     * @param unit 主办单位
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * 获取报名开始时间
     *
     * @return enroll_begin_date - 报名开始时间
     */
    public Date getEnrollBeginDate() {
        return enrollBeginDate;
    }

    /**
     * 设置报名开始时间
     *
     * @param enrollBeginDate 报名开始时间
     */
    public void setEnrollBeginDate(Date enrollBeginDate) {
        this.enrollBeginDate = enrollBeginDate;
    }

    /**
     * 获取报名结束时间
     *
     * @return enroll_end_date - 报名结束时间
     */
    public Date getEnrollEndDate() {
        return enrollEndDate;
    }

    /**
     * 设置报名结束时间
     *
     * @param enrollEndDate 报名结束时间
     */
    public void setEnrollEndDate(Date enrollEndDate) {
        this.enrollEndDate = enrollEndDate;
    }

    /**
     * 获取比赛开始时间
     *
     * @return comp_begin_date - 比赛开始时间
     */
    public Date getCompBeginDate() {
        return compBeginDate;
    }

    /**
     * 设置比赛开始时间
     *
     * @param compBeginDate 比赛开始时间
     */
    public void setCompBeginDate(Date compBeginDate) {
        this.compBeginDate = compBeginDate;
    }

    /**
     * 获取比赛结束时间
     *
     * @return comp_end_date - 比赛结束时间
     */
    public Date getCompEndDate() {
        return compEndDate;
    }

    /**
     * 设置比赛结束时间
     *
     * @param compEndDate 比赛结束时间
     */
    public void setCompEndDate(Date compEndDate) {
        this.compEndDate = compEndDate;
    }

    /**
     * 获取比赛地址
     *
     * @return address - 比赛地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置比赛地址
     *
     * @param address 比赛地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取发布状态
     *
     * @return publish_status - 发布状态
     */
    public Integer getPublishStatus() {
        return publishStatus;
    }

    /**
     * 设置发布状态
     *
     * @param publishStatus 发布状态
     */
    public void setPublishStatus(Integer publishStatus) {
        this.publishStatus = publishStatus;
    }

    /**
     * 获取发布时间
     *
     * @return publish_date - 发布时间
     */
    public Date getPublishDate() {
        return publishDate;
    }

    /**
     * 设置发布时间
     *
     * @param publishDate 发布时间
     */
    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    /**
     * 获取审核状态
     *
     * @return check_status - 审核状态
     */
    public Integer getCheckStatus() {
        return checkStatus;
    }

    /**
     * 设置审核状态
     *
     * @param checkStatus 审核状态
     */
    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
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
     * 获取创建人id
     *
     * @return create_user_id - 创建人id
     */
    public Integer getCreateUserId() {
        return createUserId;
    }

    /**
     * 设置创建人id
     *
     * @param createUserId 创建人id
     */
    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * 获取创建时间
     *
     * @return create_date - 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建时间
     *
     * @param createDate 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取创建类型：0学院，1学校
     *
     * @return create_type - 创建类型：0学院，1学校
     */
    public Boolean getCreateType() {
        return createType;
    }

    /**
     * 设置创建类型：0学院，1学校
     *
     * @param createType 创建类型：0学院，1学校
     */
    public void setCreateType(Boolean createType) {
        this.createType = createType;
    }

    /**
     * 获取创建学院
     *
     * @return create_college - 创建学院
     */
    public String getCreateCollege() {
        return createCollege;
    }

    /**
     * 设置创建学院
     *
     * @param createCollege 创建学院
     */
    public void setCreateCollege(String createCollege) {
        this.createCollege = createCollege;
    }

    /**
     * 获取总结时间
     *
     * @return summary_date - 总结时间
     */
    public Date getSummaryDate() {
        return summaryDate;
    }

    /**
     * 设置总结时间
     *
     * @param summaryDate 总结时间
     */
    public void setSummaryDate(Date summaryDate) {
        this.summaryDate = summaryDate;
    }

    /**
     * 获取总结录入人
     *
     * @return summary_user_id - 总结录入人
     */
    public Integer getSummaryUserId() {
        return summaryUserId;
    }

    /**
     * 设置总结录入人
     *
     * @param summaryUserId 总结录入人
     */
    public void setSummaryUserId(Integer summaryUserId) {
        this.summaryUserId = summaryUserId;
    }

    /**
     * 获取竞赛总结
     *
     * @return summary - 竞赛总结
     */
    public String getSummary() {
        return summary;
    }

    /**
     * 设置竞赛总结
     *
     * @param summary 竞赛总结
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", compTypeId=").append(compTypeId);
        sb.append(", compLevelId=").append(compLevelId);
        sb.append(", compCategoryId=").append(compCategoryId);
        sb.append(", form=").append(form);
        sb.append(", upperLimit=").append(upperLimit);
        sb.append(", unit=").append(unit);
        sb.append(", enrollBeginDate=").append(enrollBeginDate);
        sb.append(", enrollEndDate=").append(enrollEndDate);
        sb.append(", compBeginDate=").append(compBeginDate);
        sb.append(", compEndDate=").append(compEndDate);
        sb.append(", address=").append(address);
        sb.append(", publishStatus=").append(publishStatus);
        sb.append(", publishDate=").append(publishDate);
        sb.append(", checkStatus=").append(checkStatus);
        sb.append(", checkUserId=").append(checkUserId);
        sb.append(", checkUserName=").append(checkUserName);
        sb.append(", checkUserNo=").append(checkUserNo);
        sb.append(", checkDate=").append(checkDate);
        sb.append(", checkOpinion=").append(checkOpinion);
        sb.append(", createUserId=").append(createUserId);
        sb.append(", createDate=").append(createDate);
        sb.append(", createType=").append(createType);
        sb.append(", createCollege=").append(createCollege);
        sb.append(", summaryDate=").append(summaryDate);
        sb.append(", summaryUserId=").append(summaryUserId);
        sb.append(", summary=").append(summary);
        sb.append("]");
        return sb.toString();
    }
}