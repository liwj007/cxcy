package com.xdbigdata.cxcy.model.domain;

import javax.persistence.*;

@Table(name = "competition_news_file")
public class CompetitionNewsFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "comp_news_id")
    private Integer compNewsId;

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
     * @return comp_news_id
     */
    public Integer getCompNewsId() {
        return compNewsId;
    }

    /**
     * @param compNewsId
     */
    public void setCompNewsId(Integer compNewsId) {
        this.compNewsId = compNewsId;
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
        sb.append(", compNewsId=").append(compNewsId);
        sb.append(", file=").append(file);
        sb.append("]");
        return sb.toString();
    }
}