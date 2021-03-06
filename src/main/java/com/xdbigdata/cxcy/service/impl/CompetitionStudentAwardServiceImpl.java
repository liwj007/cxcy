package  com.xdbigdata.cxcy.service.impl;

import com.xdbigdata.cxcy.model.domain.Competition;
import com.xdbigdata.cxcy.model.domain.User;
import com.xdbigdata.framework.web.utils.SessionUserUtils;
import org.springframework.stereotype.Service;

import com.xdbigdata.cxcy.mapper.CompetitionStudentAwardMapper;
import com.xdbigdata.cxcy.model.domain.CompetitionStudentAward;
import com.xdbigdata.cxcy.service.CompetitionStudentAwardService;

import lombok.extern.slf4j.Slf4j;
import com.xdbigdata.framework.service.BaseServiceImpl;

import java.util.Date;

/**
 * CompetitionStudentAward service implement
 * 
 * @author lshaci
 */
@Service
@Slf4j
public class CompetitionStudentAwardServiceImpl extends BaseServiceImpl<CompetitionStudentAward, CompetitionStudentAwardMapper> implements CompetitionStudentAwardService {


    @Override
    public void addAward(Competition competition, String name, String desc) {
        CompetitionStudentAward award = new CompetitionStudentAward();
        award.setCompId(competition.getId());
        award.setCreateDate(new Date());
        User u = SessionUserUtils.getUserInSession(User.class);
        award.setCreateUserId(u.getId());
        award.setDescribe(desc);
        award.setName(name);
        this.insert(award);
    }
}
