package  com.xdbigdata.cxcy.service.impl;

import com.xdbigdata.cxcy.model.domain.User;
import com.xdbigdata.cxcy.model.vo.BlogrollVO;
import com.xdbigdata.framework.web.utils.SessionUserUtils;
import org.springframework.stereotype.Service;

import com.xdbigdata.cxcy.mapper.BlogrollMapper;
import com.xdbigdata.cxcy.model.domain.Blogroll;
import com.xdbigdata.cxcy.service.BlogrollService;

import lombok.extern.slf4j.Slf4j;
import com.xdbigdata.framework.service.BaseServiceImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Blogroll service implement
 * 
 * @author lshaci
 */
@Service
@Slf4j
public class BlogrollServiceImpl extends BaseServiceImpl<Blogroll, BlogrollMapper> implements BlogrollService {


    @Override
    public void addBlogroll(String name, String link) {
        Blogroll blogroll = new Blogroll();
        blogroll.setName(name);
        blogroll.setLink(link);
        User u = SessionUserUtils.getUserInSession(User.class);
        blogroll.setCreateDate(new Date());
        blogroll.setCreateUserId(u.getId());
        this.insert(blogroll);
    }

    @Override
    public void deleteBlogroll(Integer id) {
        this.delete(id);
    }

    @Override
    public void updateBlogroll(Integer id, String name, String link) {
        Blogroll blogroll = this.get(id);
        blogroll.setName(name);
        blogroll.setLink(link);
        this.update(blogroll);
    }

    @Override
    public List<BlogrollVO> getBlogroll() {
        List<Blogroll> lst  =  listAll();
        List<BlogrollVO> res = new ArrayList<>();
        for (Blogroll blogroll:lst){
            res.add(new BlogrollVO(blogroll));
        }
        return res;
    }
}
