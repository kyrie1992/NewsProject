package com.newsite.web.controller.user;

import com.newsite.web.model.User;
import com.newsite.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping("/index")
    public ModelAndView Home(){
        ModelAndView modelAndView = new ModelAndView();
        User user = userService.getUserInfo();
        modelAndView.addObject("user",user);
        modelAndView.setViewName("index");
        return modelAndView;
    }

}
