package com.xdbigdata.cxcy.service.impl;

import com.xdbigdata.cxcy.constant.Constant;
import com.xdbigdata.cxcy.constant.UserIdentity;
import com.xdbigdata.cxcy.model.domain.CompetitionFile;
import com.xdbigdata.cxcy.model.domain.CompetitionNewsNotice;
import com.xdbigdata.cxcy.model.domain.User;
import com.xdbigdata.cxcy.service.CompetitionFileService;
import com.xdbigdata.framework.web.utils.SessionUserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xdbigdata.cxcy.mapper.CompetitionMapper;
import com.xdbigdata.cxcy.model.domain.Competition;
import com.xdbigdata.cxcy.service.CompetitionService;

import lombok.extern.slf4j.Slf4j;
import com.xdbigdata.framework.service.BaseServiceImpl;

import java.util.Date;
import java.util.List;

/**
 * Competition service implement
 *
 * @author lshaci
 */
@Service
@Slf4j
public class CompetitionServiceImpl extends BaseServiceImpl<Competition, CompetitionMapper> implements CompetitionService {

    @Autowired
    public CompetitionFileService competitionFileService;


    @Override
    public void apply(String name, Integer typeId, Integer levelId, Integer categoryId, Integer formId, Integer limit, String unit, String address, Date eBeginDate, Date eEndDate, Date cBeginDate, Date cEndDate, List<String> files) {
        Competition competition = new Competition();
        competition.setTitle(name);
        competition.setCompTypeId(typeId);
        competition.setCompLevelId(levelId);
        competition.setCompCategoryId(categoryId);
        competition.setForm(formId == Constant.TEAM ? false : true);
        competition.setUpperLimit(limit);
        competition.setUnit(unit);
        competition.setAddress(address);
        competition.setEnrollBeginDate(eBeginDate);
        competition.setEnrollEndDate(eEndDate);
        competition.setCompBeginDate(cBeginDate);
        competition.setCompEndDate(cEndDate);
        competition.setCreateDate(new Date());

        User u = SessionUserUtils.getUserInSession(User.class);
        competition.setCreateUserId(u.getId());

        if (u.getIdentity().equals(UserIdentity.USER_IDENTITY_COLLEGE)){
            competition.setCreateCollege(u.getCollege());
            competition.setCreateType(Constant.COLLEGE_COMPETITION);
            competition.setCheckStatus(Constant.UNCHECKED);
        }else if (u.getIdentity().equals(UserIdentity.USER_IDENTITY_SCHOOL)){
            competition.setCreateType(Constant.SCHOOL_COMPETITION);
            competition.setCheckStatus(Constant.CHECKED);
            competition.setCheckDate(new Date());
            competition.setCheckUserId(u.getId());
            competition.setCheckUserName(u.getUsername());
            competition.setCheckUserNo(u.getNo());
            competition.setCheckOpinion("");
        }


        competition.setPublishStatus(Constant.UNPUBLISHED);

        this.insert(competition);

        for (String file:files){
            CompetitionFile competitionFile = new CompetitionFile();
            competitionFile.setCompId(competition.getId());
            competitionFile.setFile(file);
            competitionFileService.insert(competitionFile);
        }
    }

    @Override
    public void check(Integer id, String res, String opinion) {
        Competition competition = this.get(id);
        if (competition==null||competition.getCheckStatus()!=Constant.UNCHECKED){
            return;
        }
        if (res.equals("pass")){
            competition.setCheckStatus(Constant.CHECKED);
        }else if (res.equals("fail")){
            competition.setCheckStatus(Constant.UNPASS);
        }
        competition.setCheckDate(new Date());
        User u = SessionUserUtils.getUserInSession(User.class);
        competition.setCheckUserId(u.getId());
        competition.setCheckUserName(u.getUsername());
        competition.setCheckUserNo(u.getNo());
        competition.setCheckOpinion(opinion);

        this.update(competition);
    }


}
