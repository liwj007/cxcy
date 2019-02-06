package com.xdbigdata.cxcy.service;

import com.xdbigdata.cxcy.mapper.EntryFormMapper;
import com.xdbigdata.cxcy.model.domain.EntryForm;

import com.xdbigdata.cxcy.model.vo.EntryFormVO;
import com.xdbigdata.framework.service.BaseService;

/**
 * EntryForm service interface
 *
 * @author lshaci
 */
public interface EntryFormService extends BaseService<EntryForm, EntryFormMapper> {

    void entry(EntryFormVO entryFormVO);

    void check(Integer id, String res, String opinion);
}