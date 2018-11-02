package com.newsite.web.service;

import com.newsite.web.model.SingleTask;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * 线程拒绝策略
 * Created by nawei on 2018/11/2.
 */
public class ThreadRejectedHandler implements RejectedExecutionHandler {
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        try {
            SingleTask task = (SingleTask) r;
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
            System.err.println(df.format(new Date())+",报警信息：" +task.getTaskName() + "被线程池拒绝，没有被执行，5秒后重试");
            Thread.sleep(5000);
            System.err.println(df.format(new Date())+",任务重试：" + task.getTaskName() + "重试执行");
            executor.execute(task);
        } catch (Exception ex) {
            System.err.println("报警信息："+ex);
        }
    }
}
