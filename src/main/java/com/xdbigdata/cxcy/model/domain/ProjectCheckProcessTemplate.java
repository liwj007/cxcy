package com.xdbigdata.cxcy.model.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "project_check_process_template")
public class ProjectCheckProcessTemplate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 0立项，1中期，2结题
     */
    private Integer category;

    @Column(name = "start_node_id")
    private Integer startNodeId;

    /**
     * 0可用，1丢弃
     */
    private Integer status;

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
     * 获取0立项，1中期，2结题
     *
     * @return category - 0立项，1中期，2结题
     */
    public Integer getCategory() {
        return category;
    }

    /**
     * 设置0立项，1中期，2结题
     *
     * @param category 0立项，1中期，2结题
     */
    public void setCategory(Integer category) {
        this.category = category;
    }

    /**
     * @return start_node_id
     */
    public Integer getStartNodeId() {
        return startNodeId;
    }

    /**
     * @param startNodeId
     */
    public void setStartNodeId(Integer startNodeId) {
        this.startNodeId = startNodeId;
    }

    /**
     * 获取0可用，1丢弃
     *
     * @return status - 0可用，1丢弃
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置0可用，1丢弃
     *
     * @param status 0可用，1丢弃
     */
    public void setStatus(Integer status) {
        this.status = status;
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
        sb.append(", category=").append(category);
        sb.append(", startNodeId=").append(startNodeId);
        sb.append(", status=").append(status);
        sb.append(", createDate=").append(createDate);
        sb.append("]");
        return sb.toString();
    }
}