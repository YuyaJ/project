package com.project.growing.dependreplace;

/**
 * @author jsy
 * @description: 1
 **/

public class FordCar implements ICar{
    @Override
    public void run() {
        System.out.println("福特开始启动");
    }

    @Override
    public void turn() {
        System.out.println("福特开始转弯");
    }

    @Override
    public void stop() {
        System.out.println("福特开始停车");
    }
}
