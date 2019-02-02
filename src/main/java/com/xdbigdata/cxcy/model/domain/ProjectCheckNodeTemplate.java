package com.xdbigdata.cxcy.model.domain;

import javax.persistence.*;

@Table(name = "project_check_node_template")
public class ProjectCheckNodeTemplate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "prev_id")
    private Integer prevId;

    @Column(name = "next_id")
    private Integer nextId;

    @Column(name = "role_id")
    private Integer roleId;

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
     * @return prev_id
     */
    public Integer getPrevId() {
        return prevId;
    }

    /**
     * @param prevId
     */
    public void setPrevId(Integer prevId) {
        this.prevId = prevId;
    }

    /**
     * @return next_id
     */
    public Integer getNextId() {
        return nextId;
    }

    /**
     * @param nextId
     */
    public void setNextId(Integer nextId) {
        this.nextId = nextId;
    }

    /**
     * @return role_id
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * @param roleId
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", prevId=").append(prevId);
        sb.append(", nextId=").append(nextId);
        sb.append(", roleId=").append(roleId);
        sb.append("]");
        return sb.toString();
    }
}