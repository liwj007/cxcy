package com.xdbigdata.cxcy.service;

import com.xdbigdata.cxcy.mapper.EntryReviewMapper;
import com.xdbigdata.cxcy.model.domain.EntryReview;

import com.xdbigdata.framework.service.BaseService;

/**
 * EntryReview service interface
 *
 * @author lshaci
 */
public interface EntryReviewService extends BaseService<EntryReview, EntryReviewMapper> {

    void addReviewFinalPart(Integer eid, String res, double score, String opinion);

    void addReviewFilePart(Integer eid, String file);

    void addReviewOpinionPart(Integer eid, String name, double score, String opinion);
}