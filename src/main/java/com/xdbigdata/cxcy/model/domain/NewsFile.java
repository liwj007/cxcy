package com.xdbigdata.cxcy.model.domain;

import javax.persistence.*;

@Table(name = "news_file")
public class NewsFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "news_id")
    private Integer newsId;

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
     * @return news_id
     */
    public Integer getNewsId() {
        return newsId;
    }

    /**
     * @param newsId
     */
    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
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
        sb.append(", newsId=").append(newsId);
        sb.append(", file=").append(file);
        sb.append("]");
        return sb.toString();
    }
}