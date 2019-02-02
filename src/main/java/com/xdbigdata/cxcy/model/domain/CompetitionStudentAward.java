package com.xdbigdata.cxcy.model.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "competition_student_award")
public class CompetitionStudentAward {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 竞赛id
     */
    @Column(name = "comp_id")
    private Integer compId;

    /**
     * 奖项名称
     */
    private String name;

    /**
     * 说明
     */
    private String describe;

    @Column(name = "create_user_id")
    private Integer createUserId;

    @Column(name = "create_date")
    private Date createDate;

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
     * 获取奖项名称
     *
     * @return name - 奖项名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置奖项名称
     *
     * @param name 奖项名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取说明
     *
     * @return describe - 说明
     */
    public String getDescribe() {
        return describe;
    }

    /**
     * 设置说明
     *
     * @param describe 说明
     */
    public void setDescribe(String describe) {
        this.describe = describe;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", compId=").append(compId);
        sb.append(", name=").append(name);
        sb.append(", describe=").append(describe);
        sb.append(", createUserId=").append(createUserId);
        sb.append(", createDate=").append(createDate);
        sb.append("]");
        return sb.toString();
    }
}