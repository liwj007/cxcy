package com.xdbigdata.cxcy.service;

import com.xdbigdata.cxcy.mapper.CompetitionEntryMapper;
import com.xdbigdata.cxcy.model.domain.CompetitionEntry;

import com.xdbigdata.cxcy.model.domain.EntryForm;
import com.xdbigdata.framework.service.BaseService;

/**
 * CompetitionEntry service interface
 *
 * @author lshaci
 */
public interface CompetitionEntryService extends BaseService<CompetitionEntry, CompetitionEntryMapper> {

    void addWork(EntryForm form, String file);

    void deleteWork(Integer ewid);
}