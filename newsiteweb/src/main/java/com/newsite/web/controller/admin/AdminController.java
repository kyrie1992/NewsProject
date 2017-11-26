package com.newsite.web.controller.admin;

import com.newsite.web.model.User;
import com.newsite.web.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * 后台管理类
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Resource
    private UserService userService;

    /**
     * 后台管理主页面
     * @return
     */
    @RequestMapping("/")
    public ModelAndView index1(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("admin/index");
        return modelAndView;
    }
    /**
     * 后台管理主页面
     * @return
     */
    @RequestMapping("/index")
    public ModelAndView index2(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("admin/index");
        return modelAndView;
    }

    @RequestMapping("/login")
    @ResponseBody
    public boolean login(String userName, String userPassword,HttpSession session){
        User user = userService.getUserInfo(userName);
        boolean isRight = false;
        if (user!=null){
            if (user.getPasswd().equals(userPassword)){
                isRight = true;
                session.setAttribute("currentUser",user);
            }
        }
        return isRight;
    }

    @RequestMapping("/manager")
    public ModelAndView manager(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("admin/manager");
        return modelAndView;
    }

    @RequestMapping("/logout")
    public ModelAndView logout(HttpSession session){
        ModelAndView modelAndView = new ModelAndView();
        session.setAttribute("currentUser",null);
        modelAndView.setViewName("admin/index");
        return modelAndView;
    }





}
