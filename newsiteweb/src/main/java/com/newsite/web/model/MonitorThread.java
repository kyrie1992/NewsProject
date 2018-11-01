package com.newsite.web.model;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by nawei on 2018/11/1.
 */
public class MonitorThread implements Runnable{

    private ThreadPoolExecutor threadPoolExecutor;
    public MonitorThread(ThreadPoolExecutor threadPoolExecutor) {
        this.threadPoolExecutor = threadPoolExecutor;
    }

    public void run() {
        try {
            System.out.println("活跃的线程数：" + threadPoolExecutor.getActiveCount() + ",核心线程数：" + threadPoolExecutor.getCorePoolSize()
                    + ",线程池大小：" + threadPoolExecutor.getPoolSize() + ",队列的大小" + threadPoolExecutor.getQueue().size());
            Thread.sleep(2000);
        }catch (Exception ex){
            System.err.println(ex.getMessage());
        }
    }
}
