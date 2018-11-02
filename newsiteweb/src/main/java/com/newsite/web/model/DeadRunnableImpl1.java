package com.newsite.web.model;

import com.newsite.web.service.DeadLockService;

/**
 * 死锁线程
 * Created by nawei on 2018/11/2.
 */
public class DeadRunnableImpl1 implements Runnable{

    private int taskId;
    private String taskName;

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public DeadRunnableImpl1(int taskId, String taskName) {
        this.taskId = taskId;
        this.taskName = taskName;
    }

    public void run() {
        while(true) {
            synchronized (DeadLockService.objectLock2){
                System.out.println(taskName + "获取对象锁2");
                try {
                    Thread.sleep(2000);
                    synchronized (DeadLockService.objectLock1){
                        System.out.println(taskName + "获取对象锁1");
                        Thread.sleep(2000);
                    }
                }catch (Exception ex){
                    System.out.println(ex);
                }
            }
        }
    }
}
