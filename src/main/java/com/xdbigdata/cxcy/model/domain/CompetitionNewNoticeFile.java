package com.xdbigdata.cxcy.model.domain;

import javax.persistence.*;

@Table(name = "competition_new_notice_file")
public class CompetitionNewNoticeFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "comp_news_notice_id")
    private Integer compNewsNoticeId;

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
     * @return comp_news_notice_id
     */
    public Integer getCompNewsNoticeId() {
        return compNewsNoticeId;
    }

    /**
     * @param compNewsNoticeId
     */
    public void setCompNewsNoticeId(Integer compNewsNoticeId) {
        this.compNewsNoticeId = compNewsNoticeId;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", compNewsNoticeId=").append(compNewsNoticeId);
        sb.append(", file=").append(file);
        sb.append("]");
        return sb.toString();
    }
}