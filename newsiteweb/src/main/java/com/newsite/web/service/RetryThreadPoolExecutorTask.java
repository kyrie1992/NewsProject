package com.newsite.web.service;

import com.newsite.web.model.MonitorThreadRunnable;
import com.newsite.web.model.SingleTask;

import java.util.Objects;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 重试的线程池任务
 * Created by nawei on 2018/11/1.
 */
public class RetryThreadPoolExecutorTask {
    public static int flag = 0;
    public static int taskCount = 3;
    public static Object object = new Object();

    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(// 自定义一个线程池
                3, // coreSize
                3, // maxSize
                60, // 60s
                 TimeUnit.SECONDS, //保持的时间
                new ArrayBlockingQueue(3) // 有界队列，容量是3个
                , Executors.defaultThreadFactory()
                , new ThreadRejectedHandler()
        );
        /*MonitorThreadRunnable monitorThreadRunnable = new MonitorThreadRunnable(threadPoolExecutor);
        Thread monitorThread = new Thread(monitorThreadRunnable);
        monitorThread.start();*/
        for(int i=0;i<taskCount;i++){
            SingleTask task = new SingleTask(i,"任务"+(i+1));
            threadPoolExecutor.execute(task);
        }
    }
}


