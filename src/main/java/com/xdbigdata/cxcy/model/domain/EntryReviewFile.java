package com.xdbigdata.cxcy.model.domain;

import javax.persistence.*;

@Table(name = "entry_review_file")
public class EntryReviewFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 评审id
     */
    @Column(name = "entry_review_id")
    private Integer entryReviewId;

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
     * 获取评审id
     *
     * @return entry_review_id - 评审id
     */
    public Integer getEntryReviewId() {
        return entryReviewId;
    }

    /**
     * 设置评审id
     *
     * @param entryReviewId 评审id
     */
    public void setEntryReviewId(Integer entryReviewId) {
        this.entryReviewId = entryReviewId;
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
        sb.append(", entryReviewId=").append(entryReviewId);
        sb.append(", file=").append(file);
        sb.append("]");
        return sb.toString();
    }
}