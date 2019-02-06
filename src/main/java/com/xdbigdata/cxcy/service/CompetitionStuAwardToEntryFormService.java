package com.xdbigdata.cxcy.service;

import com.xdbigdata.cxcy.mapper.CompetitionStuAwardToEntryFormMapper;
import com.xdbigdata.cxcy.model.domain.CompetitionStuAwardToEntryForm;

import com.xdbigdata.cxcy.model.domain.CompetitionStudentAward;
import com.xdbigdata.framework.service.BaseService;

import java.util.List;

/**
 * CompetitionStuAwardToEntryForm service interface
 *
 * @author lshaci
 */
public interface CompetitionStuAwardToEntryFormService extends BaseService<CompetitionStuAwardToEntryForm, CompetitionStuAwardToEntryFormMapper> {

    void addStudentAward(CompetitionStudentAward studentAward, List<Integer> teamIds);
}