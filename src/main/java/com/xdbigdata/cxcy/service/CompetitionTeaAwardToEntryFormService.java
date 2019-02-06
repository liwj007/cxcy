package com.xdbigdata.cxcy.service;

import com.xdbigdata.cxcy.mapper.CompetitionTeaAwardToEntryFormMapper;
import com.xdbigdata.cxcy.model.domain.CompetitionTeaAwardToEntryForm;

import com.xdbigdata.cxcy.model.domain.CompetitionTeacherAward;
import com.xdbigdata.framework.service.BaseService;

import java.util.List;

/**
 * CompetitionTeaAwardToEntryForm service interface
 *
 * @author lshaci
 */
public interface CompetitionTeaAwardToEntryFormService extends BaseService<CompetitionTeaAwardToEntryForm, CompetitionTeaAwardToEntryFormMapper> {

    void addTeacherAward(CompetitionTeacherAward teacherAward, List<Integer> teamIds);
}