package com.xdbigdata.cxcy.service;

import com.xdbigdata.cxcy.mapper.CompetitionMapper;
import com.xdbigdata.cxcy.model.domain.Competition;

import com.xdbigdata.cxcy.model.vo.EntryFormVO;
import com.xdbigdata.framework.service.BaseService;

import java.util.Date;
import java.util.List;

/**
 * Competition service interface
 *
 * @author lshaci
 */
public interface CompetitionService extends BaseService<Competition, CompetitionMapper> {

    void apply(String name, Integer typeId, Integer levelId, Integer categoryId, Integer formId, Integer limit, String unit, String address, Date eBeginDate, Date eEndDate, Date cBeginDate, Date cEndDate, List<String> files);

    void check(Integer id, String res,String opinion);


    void summary(Integer compId, String content, List<String> files);
}