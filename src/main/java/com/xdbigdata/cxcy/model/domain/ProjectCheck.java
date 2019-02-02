package com.xdbigdata.cxcy.model.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "project_check")
public class ProjectCheck {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "process_template_id")
    private Integer processTemplateId;

    @Column(name = "project_id")
    private Integer projectId;

    @Column(name = "node_template_id")
    private Integer nodeTemplateId;

    @Column(name = "check_status")
    private Integer checkStatus;

    @Column(name = "check_date")
    private Date checkDate;

    @Column(name = "check_user_name")
    private String checkUserName;

    @Column(name = "check_user_no")
    private String checkUserNo;

    @Column(name = "check_user_id")
    private Integer checkUserId;

    @Column(name = "check_opinion")
    private String checkOpinion;

    @Column(name = "next_step_id")
    private Integer nextStepId;

    @Column(name = "prev_step_id")
    private Integer prevStepId;

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
     * @return process_template_id
     */
    public Integer getProcessTemplateId() {
        return processTemplateId;
    }

    /**
     * @param processTemplateId
     */
    public void setProcessTemplateId(Integer processTemplateId) {
        this.processTemplateId = processTemplateId;
    }

    /**
     * @return project_id
     */
    public Integer getProjectId() {
        return projectId;
    }

    /**
     * @param projectId
     */
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    /**
     * @return node_template_id
     */
    public Integer getNodeTemplateId() {
        return nodeTemplateId;
    }

    /**
     * @param nodeTemplateId
     */
    public void setNodeTemplateId(Integer nodeTemplateId) {
        this.nodeTemplateId = nodeTemplateId;
    }

    /**
     * @return check_status
     */
    public Integer getCheckStatus() {
        return checkStatus;
    }

    /**
     * @param checkStatus
     */
    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
    }

    /**
     * @return check_date
     */
    public Date getCheckDate() {
        return checkDate;
    }

    /**
     * @param checkDate
     */
    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }

    /**
     * @return check_user_name
     */
    public String getCheckUserName() {
        return checkUserName;
    }

    /**
     * @param checkUserName
     */
    public void setCheckUserName(String checkUserName) {
        this.checkUserName = checkUserName;
    }

    /**
     * @return check_user_no
     */
    public String getCheckUserNo() {
        return checkUserNo;
    }

    /**
     * @param checkUserNo
     */
    public void setCheckUserNo(String checkUserNo) {
        this.checkUserNo = checkUserNo;
    }

    /**
     * @return check_user_id
     */
    public Integer getCheckUserId() {
        return checkUserId;
    }

    /**
     * @param checkUserId
     */
    public void setCheckUserId(Integer checkUserId) {
        this.checkUserId = checkUserId;
    }

    /**
     * @return check_opinion
     */
    public String getCheckOpinion() {
        return checkOpinion;
    }

    /**
     * @param checkOpinion
     */
    public void setCheckOpinion(String checkOpinion) {
        this.checkOpinion = checkOpinion;
    }

    /**
     * @return next_step_id
     */
    public Integer getNextStepId() {
        return nextStepId;
    }

    /**
     * @param nextStepId
     */
    public void setNextStepId(Integer nextStepId) {
        this.nextStepId = nextStepId;
    }

    /**
     * @return prev_step_id
     */
    public Integer getPrevStepId() {
        return prevStepId;
    }

    /**
     * @param prevStepId
     */
    public void setPrevStepId(Integer prevStepId) {
        this.prevStepId = prevStepId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", processTemplateId=").append(processTemplateId);
        sb.append(", projectId=").append(projectId);
        sb.append(", nodeTemplateId=").append(nodeTemplateId);
        sb.append(", checkStatus=").append(checkStatus);
        sb.append(", checkDate=").append(checkDate);
        sb.append(", checkUserName=").append(checkUserName);
        sb.append(", checkUserNo=").append(checkUserNo);
        sb.append(", checkUserId=").append(checkUserId);
        sb.append(", checkOpinion=").append(checkOpinion);
        sb.append(", nextStepId=").append(nextStepId);
        sb.append(", prevStepId=").append(prevStepId);
        sb.append("]");
        return sb.toString();
    }
}