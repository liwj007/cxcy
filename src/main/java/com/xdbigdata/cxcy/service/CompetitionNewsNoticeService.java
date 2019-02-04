package com.xdbigdata.cxcy.service;

import com.xdbigdata.cxcy.mapper.CompetitionNewsNoticeMapper;
import com.xdbigdata.cxcy.model.domain.CompetitionNewsNotice;

import com.xdbigdata.framework.service.BaseService;

import java.util.List;

/**
 * CompetitionNewsNotice service interface
 *
 * @author lshaci
 */
public interface CompetitionNewsNoticeService extends BaseService<CompetitionNewsNotice, CompetitionNewsNoticeMapper> {

    void addNotice(String title, String content, List<String> files);
}