package com.project.growing.demo.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author jsy
 * @date 2020/5/28
 * @description: SingPoolDemo
 * newSingleThreadExecutor 线程池
 * 单个线程线程池，只有一个线程的线程池，阻塞队列使用的是LinkedBlockingQueue,若有多余的任务提交到线程池中，
 * 则会被暂存到阻塞队列，待空闲时再去执行。按照先入先出的顺序执行任务
 * 调用shutdown释放资源
 **/

public class SingPoolDemo {
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
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            executorService.execute(getThread(i));
        }
        executorService.shutdown();
    }
}
