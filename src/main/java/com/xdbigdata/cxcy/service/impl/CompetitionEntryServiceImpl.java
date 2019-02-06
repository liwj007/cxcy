package  com.xdbigdata.cxcy.service.impl;

import com.xdbigdata.cxcy.model.domain.EntryForm;
import com.xdbigdata.cxcy.model.domain.EntryReview;
import com.xdbigdata.cxcy.model.domain.User;
import com.xdbigdata.cxcy.service.EntryFormService;
import com.xdbigdata.cxcy.service.EntryReviewService;
import com.xdbigdata.framework.web.utils.SessionUserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xdbigdata.cxcy.mapper.CompetitionEntryMapper;
import com.xdbigdata.cxcy.model.domain.CompetitionEntry;
import com.xdbigdata.cxcy.service.CompetitionEntryService;

import lombok.extern.slf4j.Slf4j;
import com.xdbigdata.framework.service.BaseServiceImpl;

import java.util.Date;

/**
 * CompetitionEntry service implement
 * 
 * @author lshaci
 */
@Service
@Slf4j
public class CompetitionEntryServiceImpl extends BaseServiceImpl<CompetitionEntry, CompetitionEntryMapper> implements CompetitionEntryService {

    @Autowired
    public EntryReviewService entryReviewService;

    @Override
    public void addWork(EntryForm form, String file) {
        User u = SessionUserUtils.getUserInSession(User.class);

        CompetitionEntry entry = new CompetitionEntry();
        entry.setEntryFormId(form.getId());
        entry.setCompId(form.getCompId());
        entry.setCreateDate(new Date());
        entry.setCreateUserId(u.getId());
        entry.setFile(file);
        this.insert(entry);
    }

    @Override
    public void deleteWork(Integer ewid) {
        CompetitionEntry competitionEntry = this.get(ewid);
        if (competitionEntry==null)
            return;

        EntryReview example = new EntryReview();
        example.setEntryFormId(competitionEntry.getEntryFormId());
        EntryReview review = entryReviewService.getByCondition(example);
        if (review!=null){
            return;
        }

        this.delete(ewid);
    }
}
