package com.newsite.web.dao;

import com.newsite.web.model.News;

public interface NewsMapper {
    int deleteByPrimaryKey(Long newid);

    int insert(News record);

    int insertSelective(News record);

    News selectByPrimaryKey(Long newid);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKeyWithBLOBs(News record);

    int updateByPrimaryKey(News record);
}