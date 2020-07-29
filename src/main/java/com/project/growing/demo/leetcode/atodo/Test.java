package com.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author tzq
 * @date 2019-03-13 16:48
 */

public class Test {
    //公共变量
    int count=0;
    static  List<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws  Exception{
        //new一个实现Runnable的类
        Test test=new Test();
        //创建1个任务
        MyRunnable myRunnable1=test.new MyRunnable();
        //创建5个线程
        for(int i=0;i<99;i++){
            Thread t = new Thread(myRunnable1);
            t.start();
            t.join();
        }
        System.out.println("线程结束");
        System.out.println(list.size());
        long s1=System.nanoTime();
        for (Integer i :list){

        }
        System.out.println("foreach1程序耗时："+(System.nanoTime()-s1)+" ms");

        long s2=System.nanoTime();
        Iterator iter = list.iterator();
        while(iter.hasNext()){
            Object o = iter.next();
        }
        System.out.println("Iterator程序耗时："+(System.nanoTime()-s2)+" ms");

        long s3=System.nanoTime();
        int size = list.size();
        for(int i=0;i<size;i++){
            Object o= list.get(i);
        }
        System.out.println("for程序耗时："+(System.nanoTime()-s3)+" ms");

        long s4=System.nanoTime();
        for(int i=0;i<list.size();i++){
            Object o= list.get(i);
        }
        System.out.println("for程序耗时："+(System.nanoTime()-s4)+" ms");

        long s5=System.nanoTime();
        list.stream().forEach(x->{
            Object o= x;
        });
        System.out.println("stream程序耗时："+(System.nanoTime()-s5)+" ms");

        long s6=System.nanoTime();
        list.forEach(x->{
            Object o= x;
        });
        System.out.println("foreach程序耗时："+(System.nanoTime()-s6)+" ms");


    }
    //创建一个实现Runnable的类
    class MyRunnable implements Runnable{
        public void run() {
            while(true){
                //锁住的是同一对象
                synchronized(this){
                    if(count>=1000000){
                        break;
                    }
                    list.add(count);
                    System.out.println(Thread.currentThread().getName()+":count:"+(++count));
                    //测试时，线程更容易切换
                    Thread.yield();
                }

            }
        }

    }

}