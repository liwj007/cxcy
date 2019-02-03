package  com.xdbigdata.cxcy.service.impl;

import org.springframework.stereotype.Service;

import com.xdbigdata.cxcy.mapper.NewsMapper;
import com.xdbigdata.cxcy.model.domain.News;
import com.xdbigdata.cxcy.service.NewsService;

import lombok.extern.slf4j.Slf4j;
import com.xdbigdata.framework.service.BaseServiceImpl;

/**
 * News service implement
 * 
 * @author lshaci
 */
@Service
@Slf4j
public class NewsServiceImpl extends BaseServiceImpl<News, NewsMapper> implements NewsService {


}
