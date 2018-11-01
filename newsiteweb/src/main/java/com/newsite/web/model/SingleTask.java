package com.newsite.web.model;

/**
 *  单个任务
 * Created by nawei on 2018/11/1.
 */
public class SingleTask implements Runnable{
    //任务id
    private int taskId;
    //任务名字
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
    //构造函数
    public SingleTask(int taskId,String taskName){
        this.taskId = taskId;
        this.taskName = taskName;
    }

    //run方法
    public void run() {
        System.out.println("taskId:" + taskId + ",taskName:" + taskName);
        try {

            Thread.sleep(10000);

        } catch (InterruptedException e) {

            e.printStackTrace();

        }
    }
}
