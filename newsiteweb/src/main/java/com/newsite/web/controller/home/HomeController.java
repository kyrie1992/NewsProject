package com.newsite.web.controller.home;

import com.newsite.web.model.Notice;
import com.newsite.web.service.NoticeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {


    @Resource
    private NoticeService noticeService;

    @RequestMapping("/")
    public ModelAndView index1(HttpServletRequest request, HttpServletResponse response){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping("/index")
    public ModelAndView index2(HttpServletRequest request, HttpServletResponse response){
        ModelAndView modelAndView = new ModelAndView();
        List<Notice> noticeList = noticeService.getAllNotices();
        modelAndView.addObject("noticeList",noticeList);
        modelAndView.setViewName("index");
        return modelAndView;
    }
    @RequestMapping("/1zhongdui")
    public ModelAndView index3(HttpServletRequest request, HttpServletResponse response){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("news/singlenews");
        return modelAndView;
    }
    @RequestMapping("/2zhongdui")
    public ModelAndView index4(HttpServletRequest request, HttpServletResponse response){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("zhongdui/2zhongdui");
        return modelAndView;
    }
    @RequestMapping("/3zhongdui")
    public ModelAndView index5(HttpServletRequest request, HttpServletResponse response){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("news/singlenews");
        return modelAndView;
    }
    @RequestMapping("/4zhongdui")
    public ModelAndView index6(HttpServletRequest request, HttpServletResponse response){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("news/singlenews");
        return modelAndView;
    }
    @RequestMapping("/5zhongdui")
    public ModelAndView index7(HttpServletRequest request, HttpServletResponse response){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("news/singlenews");
        return modelAndView;
    }
    @RequestMapping("/6zhongdui")
    public ModelAndView index8(HttpServletRequest request, HttpServletResponse response){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("news/singlenews");
        return modelAndView;
    }@RequestMapping("/7zhongdui")
    public ModelAndView index9(HttpServletRequest request, HttpServletResponse response){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("news/singlenews");
        return modelAndView;
    }
    @RequestMapping("/8zhongdui")
    public ModelAndView index10(HttpServletRequest request, HttpServletResponse response){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("news/singlenews");
        return modelAndView;
    }

    @RequestMapping("/9zhongdui")
    public ModelAndView index11(HttpServletRequest request, HttpServletResponse response){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("news/singlenews");
        return modelAndView;
    }
    @RequestMapping("/qingwuzongdui")
    public ModelAndView index12(HttpServletRequest request, HttpServletResponse response){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("news/singlenews");
        return modelAndView;
    }
    @RequestMapping("/huayanshi")
    public ModelAndView index13(HttpServletRequest request, HttpServletResponse response){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("news/singlenews");
        return modelAndView;
    }@RequestMapping("/weishengdui")
    public ModelAndView index14(HttpServletRequest request, HttpServletResponse response){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("news/singlenews");
        return modelAndView;
    }
    @RequestMapping("/xiulisuo")
    public ModelAndView index15(HttpServletRequest request, HttpServletResponse response){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("news/singlenews");
        return modelAndView;
    }

}
