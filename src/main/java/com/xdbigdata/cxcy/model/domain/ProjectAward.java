package com.xdbigdata.cxcy.model.domain;

import javax.persistence.*;

@Table(name = "project_award")
public class ProjectAward {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String content;

    @Column(name = "create_user_name")
    private String createUserName;

    @Column(name = "create_user_no")
    private String createUserNo;

    @Column(name = "create_user_id")
    private Integer createUserId;

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

    /**
     * @return create_user_name
     */
    public String getCreateUserName() {
        return createUserName;
    }

    /**
     * @param createUserName
     */
    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    /**
     * @return create_user_no
     */
    public String getCreateUserNo() {
        return createUserNo;
    }

    /**
     * @param createUserNo
     */
    public void setCreateUserNo(String createUserNo) {
        this.createUserNo = createUserNo;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", content=").append(content);
        sb.append(", createUserName=").append(createUserName);
        sb.append(", createUserNo=").append(createUserNo);
        sb.append(", createUserId=").append(createUserId);
        sb.append("]");
        return sb.toString();
    }
}