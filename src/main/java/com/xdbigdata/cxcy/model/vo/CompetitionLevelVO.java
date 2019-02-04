package com.xdbigdata.cxcy.model.vo;

import com.xdbigdata.cxcy.model.domain.CompetitionLevel;

public class CompetitionLevelVO {
    public Integer id;
    public String name;
    public Integer nextId;
    public Integer prevId;

    public CompetitionLevelVO(CompetitionLevel competitionLevel) {
        this.id=competitionLevel.getId();
        this.name=competitionLevel.getName();
        this.nextId=competitionLevel.getNextId();
        this.prevId=competitionLevel.getPrevId();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNextId() {
        return nextId;
    }

    public void setNextId(Integer nextId) {
        this.nextId = nextId;
    }

    public Integer getPrevId() {
        return prevId;
    }

    public void setPrevId(Integer prevId) {
        this.prevId = prevId;
    }
}
