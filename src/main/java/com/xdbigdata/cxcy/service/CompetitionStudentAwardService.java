package com.xdbigdata.cxcy.service;

import com.xdbigdata.cxcy.mapper.CompetitionStudentAwardMapper;
import com.xdbigdata.cxcy.model.domain.Competition;
import com.xdbigdata.cxcy.model.domain.CompetitionStudentAward;

import com.xdbigdata.framework.service.BaseService;

/**
 * CompetitionStudentAward service interface
 *
 * @author lshaci
 */
public interface CompetitionStudentAwardService extends BaseService<CompetitionStudentAward, CompetitionStudentAwardMapper> {

    void addAward(Competition competition, String name, String desc);
}