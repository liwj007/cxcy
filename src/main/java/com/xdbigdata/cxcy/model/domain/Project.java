package com.xdbigdata.cxcy.model.domain;

import javax.persistence.*;

public class Project {
    /**
     * 编号
     */
    @Id
    private String no;

    /**
     * 名称
     */
    private String name;

    /**
     * 学院编号
     */
    @Column(name = "college_id")
    private String collegeId;

    /**
     * 学科代码
     */
    @Column(name = "subject_code")
    private String subjectCode;

    /**
     * 申请理由
     */
    @Column(name = "apply_reason")
    private String applyReason;

    /**
     * 中期报告状态
     */
    @Column(name = "middle_status")
    private Integer middleStatus;

    /**
     * 结题报告状态
     */
    @Column(name = "final_status")
    private Integer finalStatus;

    /**
     * 项目状态
     */
    private Integer status;

    @Column(name = "approval_process_id")
    private Integer approvalProcessId;

    @Column(name = "middle_process_id")
    private Integer middleProcessId;

    @Column(name = "final_process_id")
    private Integer finalProcessId;

    @Column(name = "approval_status")
    private Integer approvalStatus;

    /**
     * 立项背景
     */
    private String background;

    /**
     * 研究方案
     */
    private String plan;

    /**
     * 进度安排
     */
    private String schedule;

    /**
     * 创新点
     */
    private String innovation;

    /**
     * 预算
     */
    private String budget;

    /**
     * 成果
     */
    private String achievement;

    /**
     * 获取编号
     *
     * @return no - 编号
     */
    public String getNo() {
        return no;
    }

    /**
     * 设置编号
     *
     * @param no 编号
     */
    public void setNo(String no) {
        this.no = no;
    }

    /**
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取学院编号
     *
     * @return college_id - 学院编号
     */
    public String getCollegeId() {
        return collegeId;
    }

    /**
     * 设置学院编号
     *
     * @param collegeId 学院编号
     */
    public void setCollegeId(String collegeId) {
        this.collegeId = collegeId;
    }

    /**
     * 获取学科代码
     *
     * @return subject_code - 学科代码
     */
    public String getSubjectCode() {
        return subjectCode;
    }

    /**
     * 设置学科代码
     *
     * @param subjectCode 学科代码
     */
    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    /**
     * 获取申请理由
     *
     * @return apply_reason - 申请理由
     */
    public String getApplyReason() {
        return applyReason;
    }

    /**
     * 设置申请理由
     *
     * @param applyReason 申请理由
     */
    public void setApplyReason(String applyReason) {
        this.applyReason = applyReason;
    }

    /**
     * 获取中期报告状态
     *
     * @return middle_status - 中期报告状态
     */
    public Integer getMiddleStatus() {
        return middleStatus;
    }

    /**
     * 设置中期报告状态
     *
     * @param middleStatus 中期报告状态
     */
    public void setMiddleStatus(Integer middleStatus) {
        this.middleStatus = middleStatus;
    }

    /**
     * 获取结题报告状态
     *
     * @return final_status - 结题报告状态
     */
    public Integer getFinalStatus() {
        return finalStatus;
    }

    /**
     * 设置结题报告状态
     *
     * @param finalStatus 结题报告状态
     */
    public void setFinalStatus(Integer finalStatus) {
        this.finalStatus = finalStatus;
    }

    /**
     * 获取项目状态
     *
     * @return status - 项目状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置项目状态
     *
     * @param status 项目状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @return approval_process_id
     */
    public Integer getApprovalProcessId() {
        return approvalProcessId;
    }

    /**
     * @param approvalProcessId
     */
    public void setApprovalProcessId(Integer approvalProcessId) {
        this.approvalProcessId = approvalProcessId;
    }

    /**
     * @return middle_process_id
     */
    public Integer getMiddleProcessId() {
        return middleProcessId;
    }

    /**
     * @param middleProcessId
     */
    public void setMiddleProcessId(Integer middleProcessId) {
        this.middleProcessId = middleProcessId;
    }

    /**
     * @return final_process_id
     */
    public Integer getFinalProcessId() {
        return finalProcessId;
    }

    /**
     * @param finalProcessId
     */
    public void setFinalProcessId(Integer finalProcessId) {
        this.finalProcessId = finalProcessId;
    }

    /**
     * @return approval_status
     */
    public Integer getApprovalStatus() {
        return approvalStatus;
    }

    /**
     * @param approvalStatus
     */
    public void setApprovalStatus(Integer approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    /**
     * 获取立项背景
     *
     * @return background - 立项背景
     */
    public String getBackground() {
        return background;
    }

    /**
     * 设置立项背景
     *
     * @param background 立项背景
     */
    public void setBackground(String background) {
        this.background = background;
    }

    /**
     * 获取研究方案
     *
     * @return plan - 研究方案
     */
    public String getPlan() {
        return plan;
    }

    /**
     * 设置研究方案
     *
     * @param plan 研究方案
     */
    public void setPlan(String plan) {
        this.plan = plan;
    }

    /**
     * 获取进度安排
     *
     * @return schedule - 进度安排
     */
    public String getSchedule() {
        return schedule;
    }

    /**
     * 设置进度安排
     *
     * @param schedule 进度安排
     */
    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    /**
     * 获取创新点
     *
     * @return innovation - 创新点
     */
    public String getInnovation() {
        return innovation;
    }

    /**
     * 设置创新点
     *
     * @param innovation 创新点
     */
    public void setInnovation(String innovation) {
        this.innovation = innovation;
    }

    /**
     * 获取预算
     *
     * @return budget - 预算
     */
    public String getBudget() {
        return budget;
    }

    /**
     * 设置预算
     *
     * @param budget 预算
     */
    public void setBudget(String budget) {
        this.budget = budget;
    }

    /**
     * 获取成果
     *
     * @return achievement - 成果
     */
    public String getAchievement() {
        return achievement;
    }

    /**
     * 设置成果
     *
     * @param achievement 成果
     */
    public void setAchievement(String achievement) {
        this.achievement = achievement;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", no=").append(no);
        sb.append(", name=").append(name);
        sb.append(", collegeId=").append(collegeId);
        sb.append(", subjectCode=").append(subjectCode);
        sb.append(", applyReason=").append(applyReason);
        sb.append(", middleStatus=").append(middleStatus);
        sb.append(", finalStatus=").append(finalStatus);
        sb.append(", status=").append(status);
        sb.append(", approvalProcessId=").append(approvalProcessId);
        sb.append(", middleProcessId=").append(middleProcessId);
        sb.append(", finalProcessId=").append(finalProcessId);
        sb.append(", approvalStatus=").append(approvalStatus);
        sb.append(", background=").append(background);
        sb.append(", plan=").append(plan);
        sb.append(", schedule=").append(schedule);
        sb.append(", innovation=").append(innovation);
        sb.append(", budget=").append(budget);
        sb.append(", achievement=").append(achievement);
        sb.append("]");
        return sb.toString();
    }
}