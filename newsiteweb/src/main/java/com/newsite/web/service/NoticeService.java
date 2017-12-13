package com.newsite.web.service;

import com.newsite.web.dao.NoticeMapper;
import com.newsite.web.model.Notice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeService {

    @Autowired(required = true)
    private NoticeMapper noticeMapper;

    public List<Notice> getAllNotices() {
        return noticeMapper.getAllNotices();
    }

    public Notice getNoticeInfo(Integer noticeid) {
        Notice notice = noticeMapper.selectByPrimaryKey(noticeid);
        return notice;
    }

    public int saveNotice(Notice notice) {
        return noticeMapper.saveNotice(notice);
    }
}
