package com.project.growing.test;

/**
 * @author jsy
 * @date 2020/7/23
 * @description: test
 **/

public class Test {
    public static void main(String[] args) {
        Aobing a = new Aobing();
        a.start();
        for (;;) {
            synchronized (a) {
                if (a.isFlag()) {
                    System.out.println("有点东西");
                }

            }
        }
    }
}

class Aobing extends Thread {
    private volatile boolean flag = false;

    public boolean isFlag() {
        return flag;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        flag = true;
        System.out.println("flag = " + flag);
    }
}
