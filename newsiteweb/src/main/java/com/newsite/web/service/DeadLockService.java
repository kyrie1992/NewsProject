package com.newsite.web.service;

import com.newsite.web.model.DeadRunnableImpl1;
import com.newsite.web.model.DeadRunnableImpl2;


/**
 * 死锁例子
 * Created by nawei on 2018/11/2.
 */
public class DeadLockService {

    public static Object objectLock1 = new Object();
    public static Object objectLock2 = new Object();

    public static void main(String[] args) {
        DeadRunnableImpl1 singleTask1 = new DeadRunnableImpl1(1,"任务1");
        DeadRunnableImpl2 singleTask2 = new DeadRunnableImpl2(2,"任务2");
        Thread thread1 = new Thread(singleTask1);
        Thread thread2 = new Thread(singleTask2);
        thread1.start();
        thread2.start();
    }
}
