package com.newsite.web.model;

import java.sql.Time;

public class News {
    private Integer id;
    private Time time;//发布时间
    private String title; //标题
    private String picture; //新闻图片
    private String content; //新闻内容
    private String kind; //新闻种类（公告公示，中心工作、军事动态、政治动态、后勤动态等等）
    private String unit; //所属单位（一中队，二中队，三中队，四中队等等，考虑要不要把司令部，政治处，后勤处加进来）
    private String author;//新闻作者
    private String photographer;//摄影者
    private String approver;//审批人
    private Integer browse_times;//浏览次数

    public String getPhotographer() {
        return photographer;
    }

    public void setPhotographer(String photographer) {
        this.photographer = photographer;
    }

    public String getApprover() {
        return approver;
    }

    public void setApprover(String approver) {
        this.approver = approver;
    }

    public Integer getBrowse_times() {
        return browse_times;
    }

    public void setBrowse_times(Integer browse_times) {
        this.browse_times = browse_times;
    }

    public String getAuthor() {
        return author;

    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}

