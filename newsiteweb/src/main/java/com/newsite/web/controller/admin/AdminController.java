package com.newsite.web.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * 后台管理类
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    /**
     * 后台管理主页面
     * @return
     */
    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("admin/index");
        return modelAndView;
    }

    @RequestMapping("/login")
    @ResponseBody
    public boolean login(){
        boolean isRight = true;
        return isRight;
    }

    @RequestMapping("/manager")
    public ModelAndView manager(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("admin/manager");
        return modelAndView;
    }




}
