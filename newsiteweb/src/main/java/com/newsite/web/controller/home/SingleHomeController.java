package com.newsite.web.controller.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author zhengnawei
 * 2017-11-6
 * 每个支队的门户首页
 */
@Controller
@RequestMapping("/singlehome")
public class SingleHomeController {
    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("news/singlehome");
        return modelAndView;
    }
}
