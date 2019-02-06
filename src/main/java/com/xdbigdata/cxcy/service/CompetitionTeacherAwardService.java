package com.xdbigdata.cxcy.service;

import com.xdbigdata.cxcy.mapper.CompetitionTeacherAwardMapper;
import com.xdbigdata.cxcy.model.domain.Competition;
import com.xdbigdata.cxcy.model.domain.CompetitionTeacherAward;

import com.xdbigdata.framework.service.BaseService;

/**
 * CompetitionTeacherAward service interface
 *
 * @author lshaci
 */
public interface CompetitionTeacherAwardService extends BaseService<CompetitionTeacherAward, CompetitionTeacherAwardMapper> {

    void addAward(Competition competition, String name, String desc);
}