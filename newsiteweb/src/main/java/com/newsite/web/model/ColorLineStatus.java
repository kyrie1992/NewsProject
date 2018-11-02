package com.newsite.web.model;

/**
 * Created by nawei on 2018/11/2.
 */
public enum ColorLineStatus {
    LINE_STATUS_1AndBRANCH_STATUS_NO("greenClass","lineStatus:yes 没有branchStatus标绿色"),
    LINE_STATUS_1AndBRANCH_STATUS_2("greenClass","lineStatus:yes branchStatus:2 绿色"),
    LINE_STATUS_1AndBRANCH_STATUS_3("yellowClass","lineStatus:yes  branchStatus:3 黄色"),
    LINE_STATUS_1AndBRANCH_STATUS_0_OR_1("redClass","lineStatus:yes  branchStatus:0,1 红色"),
    LINE_STATUS_0("redClass","lineStatus:no");
    private String colorName;
    private String note;

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    private ColorLineStatus(String colorName, String note) {
        this.colorName = colorName;
        this.note = note;
    }
}
