package com.project.growing.demo.threadpool;

import java.util.concurrent.*;

/**
 * @author shenya.ji.o
 * @date 2020/5/28
 * @description: ThreadFactoryDemo
 * 线程池工厂
 * Executors的线程池如果不指定线程工厂会使用Executors中的DefaultThreadFactory,默认线程池工厂创建的线程都是非守护线程。
 * 使用自定义的线程工厂可以做很多事情，比如可以跟踪线程池在何时创建了多少线程，也可以自定义线程名称和优先级。如果将
 * 新建的线程都设置成守护线程，当主线程退出后，将会强制销毁线程池。
 **/

public class ThreadFactoryDemo {
    public static class MyTask1 implements Runnable{

        @Override
        public void run() {
            System.out.println(System.currentTimeMillis()+"Thrad ID:"+Thread.currentThread().getId());
            try {
                Thread.sleep(500);
//                TimeUnit.MICROSECONDS.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args){
        MyTask1 task = new MyTask1();
        ExecutorService es = new ThreadPoolExecutor(5, 5, 0L, TimeUnit.MICROSECONDS, new SynchronousQueue<Runnable>(), new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread t = new Thread(r);
                // 设置守护线程，主线程结束，守护线程直接强制结束。
                t.setDaemon(true);
                System.out.println("创建线程"+t);
                return  t;
            }
        });
        for (int i = 0;i<=4;i++){
            es.execute(task);
        }
    }
}
