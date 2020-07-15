package com.project.growing.demo.extendsdemo;

/**
 * @author jsy
 * @date 2020/5/22
 * @description: alarmDoor
 **/

public class AlarmDoor extends AbstractDoor implements Alarm{

    @Override
    public void alarm() {
        System.out.println("alarm");
    }

    public static void main(String[] args) {
        AlarmDoor alarmDoor = new AlarmDoor();
        alarmDoor.open();
        alarmDoor.hot();
        alarmDoor.sale();
        alarmDoor.getDay();
        alarmDoor.close();

    }

    @Override
    void open() {
        System.out.println("open");
    }

    @Override
    void close() {
        System.out.println("close");
    }
}
