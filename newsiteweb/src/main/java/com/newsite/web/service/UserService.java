package com.newsite.web.service;

import com.newsite.web.dao.UserMapper;
import com.newsite.web.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired(required=true)
    private UserMapper userMapper;

    /**
     * 根据名字查找用户
     * @return
     */
    public User getUserInfo(String userName){
        User user = userMapper.selectByName(userName);
        return user;
    }


}
