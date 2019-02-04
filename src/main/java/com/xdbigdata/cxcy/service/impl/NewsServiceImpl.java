package com.xdbigdata.cxcy.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xdbigdata.cxcy.mapper.NewsFileMapper;
import com.xdbigdata.cxcy.model.domain.Blogroll;
import com.xdbigdata.cxcy.model.domain.NewsFile;
import com.xdbigdata.cxcy.model.domain.User;
import com.xdbigdata.cxcy.model.vo.NewsVO;
import com.xdbigdata.cxcy.service.NewsFileService;
import com.xdbigdata.framework.common.model.PageResult;
import com.xdbigdata.framework.mybatis.model.MybatisPageResult;
import com.xdbigdata.framework.utils.constants.Constants;
import com.xdbigdata.framework.web.utils.SessionUserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xdbigdata.cxcy.mapper.NewsMapper;
import com.xdbigdata.cxcy.model.domain.News;
import com.xdbigdata.cxcy.service.NewsService;

import lombok.extern.slf4j.Slf4j;
import com.xdbigdata.framework.service.BaseServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.List;

/**
 * News service implement
 *
 * @author lshaci
 */
@Service
@Slf4j
public class NewsServiceImpl extends BaseServiceImpl<News, NewsMapper> implements NewsService {

    @Autowired
    public NewsFileService newsFileService;

    @Override
    @Transactional
    public void publishNews(String title, String content, Integer category, List<String> files) {
        News news = new News();
        news.setCategory(category);
        news.setTitle(title);
        news.setContent(content);
        news.setCreateDate(new Date());
        User u = SessionUserUtils.getUserInSession(User.class);
        news.setCreateUserId(u.getId());
        this.insert(news);

        for (String file : files) {
            NewsFile newsFile = new NewsFile();
            newsFile.setNewsId(news.getId());
            newsFile.setFile(file);
            newsFileService.insert(newsFile);
        }
    }

    @Override
    public Integer deleteFile(Integer newId, String name) {
        NewsFile newsFile = new NewsFile();
        newsFile.setNewsId(newId);
        newsFile.setFile(name);
        newsFileService.deleteByCondition(newsFile);
        return 1;
    }

    @Override
    public PageResult<News> getRecentNews(Integer num, Integer category) {
        return getNews(0, num, category);

    }

    private PageResult<News> getNews(Integer pageNum, Integer num, Integer category) {
        PageHelper.startPage(pageNum, num);
        Example example = new Example(News.class);
        example.orderBy("createDate").desc();
        example.createCriteria().andEqualTo("category", category);
        Page<News> page = (Page<News>) mapper.selectByExample(example);

        if (CollectionUtils.isEmpty(page)) {
            return new PageResult<>(1, num);
        }
        return new MybatisPageResult<>(page);
    }

    @Override
    public PageResult<News> getNewsList(Integer page, Integer num, Integer category) {
        return getNews(page, num, category);
    }

    @Override
    public NewsVO getNewsDetail(Integer id) {
        News news = this.get(id);
        if (news==null){
            return null;
        }
        NewsVO vo = new NewsVO();
        vo.setTitle(news.getTitle());
        vo.setContent(news.getContent());
        vo.setDate(Constants.LONG_DATE_FORMATTER.format(news.getCreateDate()));


        NewsFile newsFileExample = new NewsFile();
        newsFileExample.setNewsId(id);
        List<NewsFile> lst = newsFileService.listByCondition(newsFileExample);
        for (NewsFile file: lst){
            vo.getFiles().add(file.getFile());
        }
        return vo;
    }


}
