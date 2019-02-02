package com.xdbigdata.cxcy.model.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "project_report")
public class ProjectReport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 0周报，1期中，2结题
     */
    private Integer category;

    @Column(name = "create_date")
    private Date createDate;

    private String file;

    @Column(name = "create_user_id")
    private Integer createUserId;

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
     * 获取0周报，1期中，2结题
     *
     * @return category - 0周报，1期中，2结题
     */
    public Integer getCategory() {
        return category;
    }

    /**
     * 设置0周报，1期中，2结题
     *
     * @param category 0周报，1期中，2结题
     */
    public void setCategory(Integer category) {
        this.category = category;
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
     * @return file
     */
    public String getFile() {
        return file;
    }

    /**
     * @param file
     */
    public void setFile(String file) {
        this.file = file;
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
        sb.append(", id=").append(id);
        sb.append(", category=").append(category);
        sb.append(", createDate=").append(createDate);
        sb.append(", file=").append(file);
        sb.append(", createUserId=").append(createUserId);
        sb.append("]");
        return sb.toString();
    }
}