package com.xdbigdata.cxcy.service;

import com.xdbigdata.cxcy.mapper.CompetitionLevelMapper;
import com.xdbigdata.cxcy.model.domain.CompetitionLevel;

import com.xdbigdata.cxcy.model.vo.CompetitionLevelVO;
import com.xdbigdata.framework.service.BaseService;

import java.util.List;

/**
 * CompetitionLevel service interface
 *
 * @author lshaci
 */
public interface CompetitionLevelService extends BaseService<CompetitionLevel, CompetitionLevelMapper> {

    void addNewCompetitionLevel(String name);

    void deleteCompetitionLevel(Integer id);

    void updateCompetitionLevel(Integer id,String name);

    List<CompetitionLevelVO> loadCompetitionLevels();

    void moveUpCompetitionLevel(Integer id);

    void moveDownCompetitionLevel(Integer id);
}