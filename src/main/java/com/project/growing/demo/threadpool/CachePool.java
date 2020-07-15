package com.project.growing.demo.threadpool;

import java.util.concurrent.*;

/**
 * @author jsy
 * @date 2020/5/28
 * @description: CachePool
 * newCachedThreadPool 线程池
 * 缓存线程池，缓存的线程默认存活60秒。线程的核心池corePoolSize大小为0，
 * 核心池最大为Integer.MAX_VALUE,阻塞队列使用的是SynchronousQueue
 * 不需要调用shutdown 60秒后会释放资源
 **/

public class CachePool {
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
        ExecutorService executorService = new ThreadPoolExecutor(0, Integer.MAX_VALUE,
                60L, TimeUnit.MICROSECONDS,
                new SynchronousQueue<Runnable>(), new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread t = new Thread(r);
                t.setDaemon(true);
                System.out.println("创建线程："+t);
                return t;
            }
        });
        for (int i = 0; i < 10; i++) {
            executorService.execute(getThread(i));
        }
    }
}
