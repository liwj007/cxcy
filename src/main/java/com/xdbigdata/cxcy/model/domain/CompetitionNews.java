package com.xdbigdata.cxcy.model.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "competition_news")
public class CompetitionNews {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 标题
     */
    private String title;

    @Column(name = "create_user_id")
    private Integer createUserId;

    @Column(name = "create_date")
    private Date createDate;

    /**
     * 类型：0报名，1公告，2公示
     */
    private Integer category;

    @Column(name = "comp_id")
    private Integer compId;

    /**
     * 类型：0总结公示，1获奖公示
     */
    private Integer type;

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
     * 获取标题
     *
     * @return title - 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置标题
     *
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title;
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

    /**
     * 获取类型：0报名，1公告，2公示
     *
     * @return category - 类型：0报名，1公告，2公示
     */
    public Integer getCategory() {
        return category;
    }

    /**
     * 设置类型：0报名，1公告，2公示
     *
     * @param category 类型：0报名，1公告，2公示
     */
    public void setCategory(Integer category) {
        this.category = category;
    }

    /**
     * @return comp_id
     */
    public Integer getCompId() {
        return compId;
    }

    /**
     * @param compId
     */
    public void setCompId(Integer compId) {
        this.compId = compId;
    }

    /**
     * 获取类型：0总结公示，1获奖公示
     *
     * @return type - 类型：0总结公示，1获奖公示
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置类型：0总结公示，1获奖公示
     *
     * @param type 类型：0总结公示，1获奖公示
     */
    public void setType(Integer type) {
        this.type = type;
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
        sb.append(", title=").append(title);
        sb.append(", createUserId=").append(createUserId);
        sb.append(", createDate=").append(createDate);
        sb.append(", category=").append(category);
        sb.append(", compId=").append(compId);
        sb.append(", type=").append(type);
        sb.append(", content=").append(content);
        sb.append("]");
        return sb.toString();
    }
}