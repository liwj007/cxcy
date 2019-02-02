package com.xdbigdata.cxcy.model.domain;

import javax.persistence.*;

@Table(name = "competition_new_entry_file")
public class CompetitionNewEntryFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "comp_news_publicity_id")
    private Integer compNewsPublicityId;

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
     * @return comp_news_publicity_id
     */
    public Integer getCompNewsPublicityId() {
        return compNewsPublicityId;
    }

    /**
     * @param compNewsPublicityId
     */
    public void setCompNewsPublicityId(Integer compNewsPublicityId) {
        this.compNewsPublicityId = compNewsPublicityId;
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
        sb.append(", compNewsPublicityId=").append(compNewsPublicityId);
        sb.append(", file=").append(file);
        sb.append("]");
        return sb.toString();
    }
}