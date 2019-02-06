package  com.xdbigdata.cxcy.service.impl;

import com.xdbigdata.cxcy.constant.Constant;
import com.xdbigdata.cxcy.model.domain.*;
import com.xdbigdata.cxcy.service.EntryFormService;
import com.xdbigdata.cxcy.service.EntryReviewFileService;
import com.xdbigdata.cxcy.service.EntryReviewOpinionService;
import com.xdbigdata.framework.web.utils.SessionUserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xdbigdata.cxcy.mapper.EntryReviewMapper;
import com.xdbigdata.cxcy.service.EntryReviewService;

import lombok.extern.slf4j.Slf4j;
import com.xdbigdata.framework.service.BaseServiceImpl;

import java.util.Date;

/**
 * EntryReview service implement
 * 
 * @author lshaci
 */
@Service
@Slf4j
public class EntryReviewServiceImpl extends BaseServiceImpl<EntryReview, EntryReviewMapper> implements EntryReviewService {


    @Autowired
    public EntryFormService entryFormService;

    @Autowired
    public EntryReviewFileService entryReviewFileService;

    @Autowired
    public EntryReviewOpinionService entryReviewOpinionService;

    @Override
    public void addReviewFinalPart(Integer eid, String res, double score, String opinion) {
        EntryReview review = getEntryReview(eid);
        review.setFinalOpinion(opinion);
        if (res.equals("pass")){
            review.setFinalResult(true);
        }else if (res.equals("fail")){
            review.setFinalResult(false);
        }
        review.setFinalScore(score);
        this.update(review);
    }

    @Override
    public void addReviewFilePart(Integer eid, String file) {
        EntryReview review = getEntryReview(eid);
        EntryReviewFile reviewFile = new EntryReviewFile();
        reviewFile.setEntryReviewId(review.getId());
        reviewFile.setFile(file);
        entryReviewFileService.insert(reviewFile);
    }

    @Override
    public void addReviewOpinionPart(Integer eid, String name, double score, String opinion) {
        EntryReview review = getEntryReview(eid);
        EntryReviewOpinion reviewOpinion = new EntryReviewOpinion();
        reviewOpinion.setCreateTime(new Date());
        User u = SessionUserUtils.getUserInSession(User.class);
        reviewOpinion.setCreateUserId(u.getId());
        reviewOpinion.setEntryReviewId(review.getId());
        reviewOpinion.setJudgeName(name);
        reviewOpinion.setOpinion(opinion);
        reviewOpinion.setScore(score);
        entryReviewOpinionService.insert(reviewOpinion);
    }

    private EntryReview getEntryReview(Integer eid){
        EntryReview example = new EntryReview();
        example.setEntryFormId(eid);
        EntryReview review = this.getByCondition(example);
        if (review==null){
            EntryForm form = entryFormService.get(eid);

            review = new EntryReview();
            review.setEntryFormId(eid);
            review.setCompId(form.getCompId());
            review.setCreateDate(new Date());
            User u = SessionUserUtils.getUserInSession(User.class);
            review.setCreateUserId(u.getId());
            this.insert(review);
        }
        return review;
    }
}
