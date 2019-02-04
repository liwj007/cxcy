package com.xdbigdata.cxcy.service.impl;

import com.xdbigdata.cxcy.constant.Constant;
import com.xdbigdata.cxcy.model.domain.Competition;
import com.xdbigdata.cxcy.model.domain.User;
import com.xdbigdata.cxcy.model.vo.CompetitionLevelVO;
import com.xdbigdata.framework.web.utils.SessionUserUtils;
import org.apache.tomcat.util.bcel.Const;
import org.springframework.stereotype.Service;

import com.xdbigdata.cxcy.mapper.CompetitionLevelMapper;
import com.xdbigdata.cxcy.model.domain.CompetitionLevel;
import com.xdbigdata.cxcy.service.CompetitionLevelService;

import lombok.extern.slf4j.Slf4j;
import com.xdbigdata.framework.service.BaseServiceImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * CompetitionLevel service implement
 *
 * @author lshaci
 */
@Service
@Slf4j
public class CompetitionLevelServiceImpl extends BaseServiceImpl<CompetitionLevel, CompetitionLevelMapper> implements CompetitionLevelService {


    @Override
    public void addNewCompetitionLevel(String name) {
        CompetitionLevel competitionLevel = new CompetitionLevel();
        competitionLevel.setName(name);
        competitionLevel.setCreateDate(new Date());
        User user = SessionUserUtils.getUserInSession(User.class);
        competitionLevel.setCreateUserId(user.getId());


        CompetitionLevel competitionLevelExample = new CompetitionLevel();
        competitionLevelExample.setNextId(Constant.NODE_END);
        CompetitionLevel endCurrent = this.getByCondition(competitionLevelExample);
        if (endCurrent == null) {
            competitionLevel.setPrevId(Constant.NODE_START);
            competitionLevel.setNextId(Constant.NODE_END);
            this.insert(competitionLevel);
        } else {
            competitionLevel.setPrevId(endCurrent.getId());
            competitionLevel.setNextId(Constant.NODE_END);
            this.insert(competitionLevel);

            endCurrent.setNextId(competitionLevel.getId());
            this.update(endCurrent);
        }
    }

    @Override
    public void deleteCompetitionLevel(Integer id) {
        CompetitionLevel current = this.get(id);
        if (current == null) {
            return;
        }
        CompetitionLevel prevNode = null;
        if (current.getPrevId() != Constant.NODE_START) {
            prevNode = this.get(current.getPrevId());

        }
        CompetitionLevel nextNode = null;
        if (current.getNextId() != Constant.NODE_END) {
            nextNode = this.get(current.getNextId());
        }

        if (prevNode != null) {
            prevNode.setNextId(nextNode == null ? Constant.NODE_END : nextNode.getId());
            this.update(prevNode);
        }
        if (nextNode != null) {
            nextNode.setPrevId(prevNode == null ? Constant.NODE_START : prevNode.getId());
            this.update(nextNode);
        }


        this.delete(id);
    }

    @Override
    public void updateCompetitionLevel(Integer id, String name) {
        CompetitionLevel competitionLevel = this.get(id);
        if (competitionLevel == null) {
            return;
        }
        competitionLevel.setName(name);
        this.update(competitionLevel);
    }

    @Override
    public List<CompetitionLevelVO> loadCompetitionLevels() {

        List<CompetitionLevelVO> res = new ArrayList<>();


        CompetitionLevel example = new CompetitionLevel();
        example.setPrevId(Constant.NODE_START);

        CompetitionLevel cl = this.getByCondition(example);
        if (cl==null){
            return res;
        }

        do {
            res.add(new CompetitionLevelVO(cl));
            if (cl.getNextId()!=Constant.NODE_END){
                cl = this.get(cl.getNextId());
            }else{
                cl = null;
            }
        }while (cl!=null);


        return res;
    }

    @Override
    public void moveUpCompetitionLevel(Integer id) {
        CompetitionLevel current = this.get(id);
        if (current == null || current.getPrevId() == Constant.NODE_START) {
            return;
        }

        CompetitionLevel prevNode = this.get(current.getPrevId());
        CompetitionLevel nextNode = null;
        if (current.getNextId() != Constant.NODE_END) {
            nextNode = this.get(current.getNextId());
        }

        CompetitionLevel pprevNode = null;
        if (prevNode.getPrevId()!=Constant.NODE_START){
            pprevNode = this.get(prevNode.getPrevId());
        }

        prevNode.setNextId(current.getNextId());

        current.setPrevId(prevNode.getPrevId());
        current.setNextId(prevNode.getId());
        this.update(current);

        prevNode.setPrevId(current.getId());

        this.update(prevNode);

        if (nextNode!=null){
            nextNode.setPrevId(prevNode.getId());
            this.update(nextNode);
        }

        if (pprevNode!=null){
            pprevNode.setNextId(current.getId());
            this.update(pprevNode);
        }
    }

    @Override
    public void moveDownCompetitionLevel(Integer id) {
        CompetitionLevel current = this.get(id);
        if (current == null || current.getNextId() == Constant.NODE_END) {
            return;
        }

        CompetitionLevel nextNode = this.get(current.getNextId());
        CompetitionLevel prevNode = null;
        if (current.getPrevId()!=Constant.NODE_START){
            prevNode = this.get(current.getPrevId());
        }

        CompetitionLevel nnextNode = null;
        if (nextNode.getNextId()!=Constant.NODE_END){
            nnextNode = this.get(nextNode.getNextId());
        }

        nextNode.setPrevId(current.getPrevId());

        current.setPrevId(nextNode.getId());
        current.setNextId(nextNode.getNextId());
        this.update(current);

        nextNode.setNextId(current.getId());
        this.update(nextNode);

        if (prevNode!=null){
            prevNode.setNextId(nextNode.getId());
            this.update(prevNode);
        }

        if (nnextNode!=null){
            nnextNode.setPrevId(current.getId());
            this.update(nnextNode);
        }

    }
}
