package com.newsite.web.model;

import java.util.List;

/**
 * 树节点
 * Created by nawei on 2018/10/26.
 */
public class TreeNode {
    private String text;
    private String href;
    private Integer tags;
    private List<TreeNode> nodes;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Integer getTags() {
        return tags;
    }

    public void setTags(Integer tags) {
        this.tags = tags;
    }

    public List<TreeNode> getNodes() {
        return nodes;
    }

    public void setNodes(List<TreeNode> nodes) {
        this.nodes = nodes;
    }
}
