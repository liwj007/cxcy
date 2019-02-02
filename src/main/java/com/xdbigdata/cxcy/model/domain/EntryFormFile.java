package com.xdbigdata.cxcy.model.domain;

import javax.persistence.*;

@Table(name = "entry_form_file")
public class EntryFormFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 参赛表id
     */
    @Column(name = "entry_form_id")
    private Integer entryFormId;

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
        sb.append(", entryFormId=").append(entryFormId);
        sb.append(", file=").append(file);
        sb.append("]");
        return sb.toString();
    }
}