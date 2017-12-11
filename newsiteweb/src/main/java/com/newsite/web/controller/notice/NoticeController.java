package com.newsite.web.controller.notice;


import com.newsite.web.model.Notice;
import com.newsite.web.service.NoticeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;

import javax.annotation.Resource;

@Controller
@RequestMapping("/notice")
public class NoticeController
{
    @Resource
    private NoticeService noticeService;

    @RequestMapping("/showNotice")
    public String toIndex(HttpServletRequest request,Model model){
        int noticeId = Integer.parseInt(request.getParameter("id"));
        Notice notice = this.noticeService.getNoticeInfo(noticeId);
        model.addAttribute("notice", notice);
        return "notice";
    }

}
