package com.project.growing.demo.basedemo;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.List;

/**
 * @author shenya.ji.o
 * @date 2020/6/2
 * @description: JDK回收器打印
 **/

public class GcCollectorPrinter {
    public static void main(String[] args) {
        List<GarbageCollectorMXBean> beans = ManagementFactory.getGarbageCollectorMXBeans();
        for (GarbageCollectorMXBean bean : beans) {
            System.out.println(bean.getName());
        }
    }
}
