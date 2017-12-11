package com.newsite.web.service;

import com.newsite.web.dao.NoticeMapper;
import com.newsite.web.model.Notice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticeService {
    @Autowired(required = true)
    private NoticeMapper noticeMapper;

    public Notice getNoticeInfo(Integer noticeid) {
        Notice notice = noticeMapper.selectByPrimaryKey(noticeid);
        return notice;
    }
}
