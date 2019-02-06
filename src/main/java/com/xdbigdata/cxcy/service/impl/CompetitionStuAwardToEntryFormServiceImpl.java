package  com.xdbigdata.cxcy.service.impl;

import com.xdbigdata.cxcy.model.domain.CompetitionStudentAward;
import com.xdbigdata.cxcy.model.domain.User;
import com.xdbigdata.framework.web.utils.SessionUserUtils;
import org.springframework.stereotype.Service;

import com.xdbigdata.cxcy.mapper.CompetitionStuAwardToEntryFormMapper;
import com.xdbigdata.cxcy.model.domain.CompetitionStuAwardToEntryForm;
import com.xdbigdata.cxcy.service.CompetitionStuAwardToEntryFormService;

import lombok.extern.slf4j.Slf4j;
import com.xdbigdata.framework.service.BaseServiceImpl;

import java.util.Date;
import java.util.List;

/**
 * CompetitionStuAwardToEntryForm service implement
 * 
 * @author lshaci
 */
@Service
@Slf4j
public class CompetitionStuAwardToEntryFormServiceImpl extends BaseServiceImpl<CompetitionStuAwardToEntryForm, CompetitionStuAwardToEntryFormMapper> implements CompetitionStuAwardToEntryFormService {


    @Override
    public void addStudentAward(CompetitionStudentAward studentAward, List<Integer> teamIds) {
        for (Integer teamId: teamIds){
            CompetitionStuAwardToEntryForm to = new CompetitionStuAwardToEntryForm();
            to.setCompStuAwardId(studentAward.getId());
            to.setEntryFormId(teamId);
            to.setCreateDate(new Date());
            User u = SessionUserUtils.getUserInSession(User.class);
            to.setCreateUserId(u.getId());
            this.insert(to);
        }
    }
}
