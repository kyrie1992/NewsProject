package com.newsite.web.controller.home;

import com.newsite.web.model.TreeNode;
import com.newsite.web.service.ReportGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping("/index")
    public ModelAndView index1(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView();
        List<TreeNode> treeNodeList = new ArrayList<TreeNode>();
        try {
            treeNodeList = ReportGenerator.getResultTreeData(ReportGenerator.getBundleCoverage());
        } catch (Exception ex) {
            System.err.println("获取代码覆盖率数据错误："+ex.getMessage());
        }
        modelAndView.setViewName("coverShow");
        modelAndView.addObject("treeNodeList", treeNodeList);
        return modelAndView;
    }

    @ResponseBody
    @RequestMapping("/fileDetail")
    public String index2(HttpServletRequest request, HttpServletResponse response) {
        String fileName = request.getParameter("fileName");
        return fileName;
    }
}
