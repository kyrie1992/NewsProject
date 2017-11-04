package com.newsite.web.controller.news;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/news")
public class NewsManagerController {

    @RequestMapping("/detail")
    public ModelAndView newDetail(String newsid){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("newsTitle","文章标题");
        modelAndView.setViewName("/news/newsdetail");
        return modelAndView;
    }
}
