package com.newsite.web.service;

import com.newsite.web.dao.UserMapper;
import com.newsite.web.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserInfo(){
        User user = userMapper.selectByPrimaryKey(1);
        return user;
    }


}
