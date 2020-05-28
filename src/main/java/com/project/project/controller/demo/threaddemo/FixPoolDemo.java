package com.project.project.controller.demo.threaddemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author shenya.ji.o
 * @date 2020/5/28
 * @description: FixPoolDemo
 * newFixedThreadPool 线程池
 * 固定大小的线程池，可以指定线程池的大小，该线程池corePoolSize和maximumPoolSize相等，
 * 阻塞队列使用的是LinkedBlockingQueue，大小为整数最大值
 * 调用shutdown释放资源
 **/

public class FixPoolDemo {
    private static Runnable getThread(final int i) {
        return new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i);
            }
        };
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            executorService.execute(getThread(i));
        }
        executorService.shutdown();
    }
}
