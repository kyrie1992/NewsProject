package com.newsite.web.service;

import com.newsite.web.dao.UserMapper;
import com.newsite.web.model.TreeNode;
import com.newsite.web.model.User;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 结果分析工具类
 * Created by nawei on 2018/11/2.
 */
public class CoverResultAnalysisHelper {

    @Resource
    private UserMapper userMapper;

    public List<TreeNode> getAllUserInfo(){
        List<TreeNode> resultList = new ArrayList<TreeNode>();
        User user = new User();
        user.setUsername("classpackage");
        TreeNode treeNode = new TreeNode();
        treeNode.setText(user.getUsername());
        treeNode.setTags(3);
        treeNode.setNodes(initUserInfo());
        resultList.add(treeNode);
        return resultList;
    }

    private List<TreeNode> initUserInfo(){
        List<TreeNode> list = new ArrayList<TreeNode>();
        for(int i=0;i<3;i++){
            TreeNode treeNode = new TreeNode();
            treeNode.setText("className"+i);
            list.add(treeNode);
        }
        return list;
    }

}
