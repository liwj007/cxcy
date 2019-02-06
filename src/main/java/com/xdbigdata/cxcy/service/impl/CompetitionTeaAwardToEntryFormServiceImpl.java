package  com.xdbigdata.cxcy.service.impl;

import com.xdbigdata.cxcy.model.domain.*;
import com.xdbigdata.framework.web.utils.SessionUserUtils;
import org.springframework.stereotype.Service;

import com.xdbigdata.cxcy.mapper.CompetitionTeaAwardToEntryFormMapper;
import com.xdbigdata.cxcy.service.CompetitionTeaAwardToEntryFormService;

import lombok.extern.slf4j.Slf4j;
import com.xdbigdata.framework.service.BaseServiceImpl;

import java.util.Date;
import java.util.List;

/**
 * CompetitionTeaAwardToEntryForm service implement
 * 
 * @author lshaci
 */
@Service
@Slf4j
public class CompetitionTeaAwardToEntryFormServiceImpl extends BaseServiceImpl<CompetitionTeaAwardToEntryForm, CompetitionTeaAwardToEntryFormMapper> implements CompetitionTeaAwardToEntryFormService {

    @Override
    public void addTeacherAward(CompetitionTeacherAward teacherAward, List<Integer> teamIds) {
        for (Integer teamId: teamIds){
            CompetitionTeaAwardToEntryForm to = new CompetitionTeaAwardToEntryForm();
            to.setCompTeaAwardId(teacherAward.getId());
            to.setEntryFormId(teamId);
            to.setCreateDate(new Date());
            User u = SessionUserUtils.getUserInSession(User.class);
            to.setCreateUserId(u.getId());
            this.insert(to);
        }
    }
}
