package com.newsite.web.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/manager")
public class ManagerController {

    @RequestMapping("/newslist")
    public ModelAndView newsList(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("admin/manager/newslist");
        return modelAndView;
    }

    @RequestMapping("/newspublish")
    public ModelAndView newsPublish(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("admin/manager/newspublish");
        return modelAndView;
    }
    @RequestMapping("/noticepublish")
    public ModelAndView noticePublish(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("admin/manager/noticepublish");
        return modelAndView;
    }

    @RequestMapping("/usermanager")
    public ModelAndView userManager(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("admin/manager/usermanager");
        return modelAndView;
    }



}
