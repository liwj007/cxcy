package com.xdbigdata.cxcy.service;

import com.xdbigdata.cxcy.mapper.BlogrollMapper;
import com.xdbigdata.cxcy.model.domain.Blogroll;

import com.xdbigdata.cxcy.model.vo.BlogrollVO;
import com.xdbigdata.framework.service.BaseService;

import java.util.List;

/**
 * Blogroll service interface
 *
 * @author lshaci
 */
public interface BlogrollService extends BaseService<Blogroll, BlogrollMapper> {

    void addBlogroll(String name, String link);

    void deleteBlogroll(Integer id);

    void updateBlogroll(Integer id, String name, String link);

    List<BlogrollVO> getBlogroll();
}