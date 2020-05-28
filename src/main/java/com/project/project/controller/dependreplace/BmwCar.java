package com.project.project.controller.dependreplace;

/**
 * @author shenya.ji.o
 * @description: 1
 **/

public class BmwCar implements ICar{
    @Override
    public void run() {
        System.out.println("宝马开始启动");
    }

    @Override
    public void turn() {
        System.out.println("宝马开始转弯");
    }

    @Override
    public void stop() {
        System.out.println("宝马开始停车");
    }
}
