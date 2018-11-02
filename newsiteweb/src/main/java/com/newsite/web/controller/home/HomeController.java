package com.newsite.web.controller.home;

import com.newsite.web.model.TreeNode;
import com.newsite.web.service.CoverResultAnalysisHelper;
import com.newsite.web.service.FileUtils;
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
            //CoverResultAnalysisHelper coverResultAnalysisHelper = new CoverResultAnalysisHelper();
            treeNodeList = ReportGenerator.getResultTreeData(ReportGenerator.getBundleCoverage());
            //treeNodeList = coverResultAnalysisHelper.getAllUserInfo();
        } catch (Exception ex) {
            System.err.println("获取代码覆盖率数据错误："+ex.getMessage());
        }
        modelAndView.setViewName("coverShow");
        modelAndView.addObject("treeNodeList", treeNodeList);
        return modelAndView;
    }

    @ResponseBody
    @RequestMapping(value = "/fileDetail",produces="text/html;charset=UTF-8;")
    public String index2(HttpServletRequest request, HttpServletResponse response) {
        try {
            String fileName = request.getParameter("fileName");
            File[] result = FileUtils.searchFile(new File("D:\\周报"), fileName);
            String filecontent = FileUtils.readFileByLine(new File(result[0].getAbsolutePath()));
            return filecontent;
        }catch (Exception ex){
            System.err.println("读取文件内容错误："+ex.getMessage());
        }
        return null;
    }
}
