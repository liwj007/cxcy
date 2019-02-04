package com.xdbigdata.cxcy.model.vo;

import java.util.ArrayList;
import java.util.List;

public class NewsVO {
    public String title;
    public String content;
    public String date;
    public List<String> files;

    public NewsVO() {
        this.files=new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<String> getFiles() {
        return files;
    }

    public void setFiles(List<String> files) {
        this.files = files;
    }
}
