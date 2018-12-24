package com.newsite.web.controller.echarts;

import com.newsite.web.model.ProductInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by nawei on 2018/11/28.
 */
@RequestMapping("/echarts")
@Controller
public class EchartsController {

    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/echarts/index");
        return modelAndView;
    }

    @RequestMapping(value = "productInfos",method = RequestMethod.GET)
    public @ResponseBody Map<String,Object> getProductInfos(){
        Map<String,Object> resultMap = new HashMap<String, Object>();
        List<String> categoryList = new ArrayList<String>();
        List<Integer> dataList = new ArrayList<Integer>();
        List<ProductInfo> list = new ArrayList<ProductInfo>();
        for(int i=0;i<10;i++){
            ProductInfo productInfo = new ProductInfo();
            productInfo.setName("测试"+i);
            categoryList.add("测试"+i);
            productInfo.setNum(i+1);
            dataList.add(i+1);
            list.add(productInfo);
        }
        resultMap.put("categories",categoryList);
        resultMap.put("data",dataList);
        return resultMap;
    }
}
