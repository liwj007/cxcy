package com.xdbigdata.cxcy.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xdbigdata.cxcy.constant.Constant;
import com.xdbigdata.cxcy.model.domain.CompetitionNewsFile;
import com.xdbigdata.cxcy.model.domain.News;
import com.xdbigdata.cxcy.model.domain.User;
import com.xdbigdata.cxcy.service.CompetitionNewsFileService;
import com.xdbigdata.framework.common.model.PageResult;
import com.xdbigdata.framework.mybatis.model.MybatisPageResult;
import com.xdbigdata.framework.web.utils.SessionUserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xdbigdata.cxcy.mapper.CompetitionNewsMapper;
import com.xdbigdata.cxcy.model.domain.CompetitionNews;
import com.xdbigdata.cxcy.service.CompetitionNewsService;

import lombok.extern.slf4j.Slf4j;
import com.xdbigdata.framework.service.BaseServiceImpl;
import org.springframework.util.CollectionUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.List;

/**
 * CompetitionNews service implement
 *
 * @author lshaci
 */
@Service
@Slf4j
public class CompetitionNewsServiceImpl extends BaseServiceImpl<CompetitionNews, CompetitionNewsMapper> implements CompetitionNewsService {

    @Autowired
    public CompetitionNewsFileService fileService;

    @Override
    public void addNotice(String title, String content, List<String> files) {
        CompetitionNews competitionNews = new CompetitionNews();
        competitionNews.setTitle(title);
        competitionNews.setContent(content);
        competitionNews.setCategory(Constant.NOTICE);
        competitionNews.setCreateDate(new Date());
        User u = SessionUserUtils.getUserInSession(User.class);
        competitionNews.setCreateUserId(u.getId());
        this.insert(competitionNews);

       addFile(competitionNews,files);
    }

    @Override
    public void addEntry(String title, String content, Integer compId, List<String> files) {
        CompetitionNews competitionNews = new CompetitionNews();
        competitionNews.setTitle(title);
        competitionNews.setContent(content);
        competitionNews.setCategory(Constant.ENTRY);
        competitionNews.setCompId(compId);
        competitionNews.setCreateDate(new Date());
        User u = SessionUserUtils.getUserInSession(User.class);
        competitionNews.setCreateUserId(u.getId());
        this.insert(competitionNews);

        addFile(competitionNews,files);
    }

    private void addFile(CompetitionNews competitionNews,List<String> files){
        for (String file : files) {
            CompetitionNewsFile newsFile = new CompetitionNewsFile();
            newsFile.setCompNewsId(competitionNews.getId());
            newsFile.setFile(file);
            fileService.insert(newsFile);
        }
    }

    @Override
    public void addPublicity(String title, String content, Integer compId, Integer type, List<String> files) {
        CompetitionNews competitionNews = new CompetitionNews();
        competitionNews.setTitle(title);
        competitionNews.setContent(content);
        competitionNews.setCategory(Constant.PUBLICITY);
        competitionNews.setType(type);
        competitionNews.setCompId(compId);
        competitionNews.setCreateDate(new Date());
        User u = SessionUserUtils.getUserInSession(User.class);
        competitionNews.setCreateUserId(u.getId());
        this.insert(competitionNews);

        addFile(competitionNews,files);
    }

    @Override
    public PageResult<CompetitionNews> loadNews(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Example example = new Example(CompetitionNews.class);
        example.orderBy("createDate").desc();
        Page<CompetitionNews> page = (Page<CompetitionNews>) mapper.selectByExample(example);

        if (CollectionUtils.isEmpty(page)) {
            return new PageResult<>(1, pageSize);
        }
        return new MybatisPageResult<>(page);
    }
}
