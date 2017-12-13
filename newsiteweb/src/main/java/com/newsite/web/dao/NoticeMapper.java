package com.newsite.web.dao;

import com.newsite.web.model.Notice;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface NoticeMapper {
    int deleteByPrimaryKey(Integer noticeid);

    int insert(Notice record);

    int insertSelective(Notice record);

    Notice selectByPrimaryKey(Integer noticeid);

    int updateByPrimaryKeySelective(Notice record);

    int updateByPrimaryKeyWithBLOBs(Notice record);

    int updateByPrimaryKey(Notice record);

    int saveNotice(Notice record);

    public List<Notice> getAllNotices();

}