package com.xdbigdata.cxcy.service;

import com.xdbigdata.cxcy.mapper.NewsMapper;
import com.xdbigdata.cxcy.model.domain.Blogroll;
import com.xdbigdata.cxcy.model.domain.News;

import com.xdbigdata.cxcy.model.vo.NewsVO;
import com.xdbigdata.framework.common.model.PageResult;
import com.xdbigdata.framework.service.BaseService;

import java.util.List;

/**
 * News service interface
 *
 * @author lshaci
 */
public interface NewsService extends BaseService<News, NewsMapper> {

    void publishNews(String title, String content, Integer category, List<String> files);

    Integer deleteFile(Integer newId, String name);

    PageResult<News> getRecentNews(Integer num, Integer category);

    PageResult<News> getNewsList(Integer page, Integer num, Integer category);

    NewsVO getNewsDetail(Integer id);


}