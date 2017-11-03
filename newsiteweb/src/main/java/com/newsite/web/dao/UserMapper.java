package com.newsite.web.dao;


import com.newsite.web.model.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

@MapperScan
@Component(value = "userMapper")
public interface UserMapper {

    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}