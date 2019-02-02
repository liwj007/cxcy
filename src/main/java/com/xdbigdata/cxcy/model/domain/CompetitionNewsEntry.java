package com.xdbigdata.cxcy.model.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "competition_news_entry")
public class CompetitionNewsEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 竞赛id
     */
    @Column(name = "comp_id")
    private Integer compId;

    private String title;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "create_user_id")
    private Integer createUserId;

    private String content;

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
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
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

    /**
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", compId=").append(compId);
        sb.append(", title=").append(title);
        sb.append(", createDate=").append(createDate);
        sb.append(", createUserId=").append(createUserId);
        sb.append(", content=").append(content);
        sb.append("]");
        return sb.toString();
    }
}