package com.xdbigdata.cxcy.model.vo;

import com.xdbigdata.cxcy.model.domain.Blogroll;

public class BlogrollVO {
    public String name;
    public String link;

    public BlogrollVO(Blogroll blogroll) {
        this.name = blogroll.getName();
        this.link = blogroll.getLink();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
