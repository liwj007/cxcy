package com.xdbigdata.cxcy.model.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "competition_entry")
public class CompetitionEntry {
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

    /**
     * 创建时间
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 创建用户
     */
    @Column(name = "create_user_id")
    private Integer createUserId;

    /**
     * 附件
     */
    private String file;

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
     * 获取创建用户
     *
     * @return create_user_id - 创建用户
     */
    public Integer getCreateUserId() {
        return createUserId;
    }

    /**
     * 设置创建用户
     *
     * @param createUserId 创建用户
     */
    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * 获取附件
     *
     * @return file - 附件
     */
    public String getFile() {
        return file;
    }

    /**
     * 设置附件
     *
     * @param file 附件
     */
    public void setFile(String file) {
        this.file = file;
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
        sb.append(", file=").append(file);
        sb.append("]");
        return sb.toString();
    }
}