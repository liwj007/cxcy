package com.xdbigdata.cxcy.model.domain;

import javax.persistence.*;

@Table(name = "competition_file")
public class CompetitionFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 竞赛id
     */
    @Column(name = "comp_id")
    private Integer compId;

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
        sb.append(", compId=").append(compId);
        sb.append(", file=").append(file);
        sb.append("]");
        return sb.toString();
    }
}