package com.xdbigdata.cxcy.web.controller;

import com.xdbigdata.cxcy.model.domain.Blogroll;
import com.xdbigdata.cxcy.model.domain.News;
import com.xdbigdata.cxcy.model.domain.User;
import com.xdbigdata.cxcy.model.vo.BlogrollVO;
import com.xdbigdata.cxcy.model.vo.LoginUser;
import com.xdbigdata.cxcy.model.vo.NewsVO;
import com.xdbigdata.cxcy.service.BlogrollService;
import com.xdbigdata.cxcy.service.NewsService;
import com.xdbigdata.framework.common.model.PageResult;
import com.xdbigdata.framework.web.annotation.IgnoreRole;
import com.xdbigdata.framework.web.model.JsonResponse;
import com.xdbigdata.framework.web.utils.SessionUserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/news")
public class NewsController {

    @Autowired
    public NewsService newsService;

    @Autowired
    public BlogrollService blogrollService;

    @RequestMapping(value = "/publish", method = RequestMethod.POST)
    public JsonResponse publishNews(@RequestParam(value = "title") String title,
                                  @RequestParam(value = "content") String content,
                                  @RequestParam(value = "category") Integer category,
                                  @RequestParam(value = "files") List<String> files) {
        newsService.publishNews(title, content, category, files);
        return JsonResponse.success(null);
    }

    @RequestMapping(value = "/del_file", method = RequestMethod.POST)
    public JsonResponse deleteFile(@RequestParam(value = "nid") Integer newId,
                                   @RequestParam(value = "name") String name) {
        Integer id = newsService.deleteFile(newId, name);
        if (id != null && id > 0) {
            return JsonResponse.success(null);
        } else {
            return JsonResponse.failure(null);
        }
    }

    @RequestMapping(value = "/recent", method = RequestMethod.GET)
    public JsonResponse loadRecentNews(@RequestParam(value = "num") Integer num,
                                  @RequestParam(value = "category") Integer category) {
        PageResult<News> lst = newsService.getRecentNews(num, category);
        return JsonResponse.success(lst);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public JsonResponse loadNewsList(@RequestParam(value = "page") Integer page,
                                     @RequestParam(value = "num") Integer num,
                                       @RequestParam(value = "category") Integer category) {
        PageResult<News> lst = newsService.getNewsList(page,num, category);
        return JsonResponse.success(lst);
    }

    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    public JsonResponse loadNewsDetail(@RequestParam(value = "id") Integer id) {
        NewsVO vo = newsService.getNewsDetail(id);
        return JsonResponse.success(vo);
    }

    @RequestMapping(value = "/add_blogroll", method = RequestMethod.POST)
    public JsonResponse addBlogroll(@RequestParam(value = "name") String name,
                                   @RequestParam(value = "link") String link) {
       blogrollService.addBlogroll(name,link);
       return JsonResponse.success(null);
    }

    @RequestMapping(value = "/del_blogroll", method = RequestMethod.POST)
    public JsonResponse delBlogroll(@RequestParam(value = "id") Integer id) {
        blogrollService.deleteBlogroll(id);
        return JsonResponse.success(null);
    }

    @RequestMapping(value = "/update_blogroll", method = RequestMethod.POST)
    public JsonResponse updateBlogroll(@RequestParam(value = "id") Integer id,
                                    @RequestParam(value = "name") String name,
                                    @RequestParam(value = "link") String link) {
        blogrollService.updateBlogroll(id,name,link);
        return JsonResponse.success(null);
    }

    @RequestMapping(value = "/all_blogroll", method = RequestMethod.GET)
    public JsonResponse loadAllblogroll() {
        List<BlogrollVO> lst = blogrollService.getBlogroll();
        return JsonResponse.success(lst);
    }
}
