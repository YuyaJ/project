package com.project.growing.demo.extendsdemo;

/**
 * @author jsy
 * @date 2020/5/22
 * @description: alarm
 **/

public interface Alarm {
    /**
     * 警报
     */
    void alarm();

    /**
     * 日期
     */
    default void getDay() {
        System.out.println("getDay");
    }
}
