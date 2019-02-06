package com.xdbigdata.cxcy.service;

import com.xdbigdata.cxcy.mapper.CompetitionNewsMapper;
import com.xdbigdata.cxcy.model.domain.CompetitionNews;

import com.xdbigdata.framework.common.model.PageResult;
import com.xdbigdata.framework.service.BaseService;

import java.util.List;

/**
 * CompetitionNews service interface
 *
 * @author lshaci
 */
public interface CompetitionNewsService extends BaseService<CompetitionNews, CompetitionNewsMapper> {

    void addNotice(String title, String content, List<String> files);

    void addEntry(String title, String content, Integer compId, List<String> files);

    void addPublicity(String title, String content, Integer compId, Integer type, List<String> files);

    PageResult<CompetitionNews> loadNews(Integer pageNum, Integer pageSize);
}