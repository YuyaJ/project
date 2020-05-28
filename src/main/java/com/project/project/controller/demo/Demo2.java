package com.project.project.controller.demo;

import org.springframework.beans.BeanUtils;
import static com.project.project.controller.demo.EnumDemo.*;

/**
 * @author shenya.ji.o
 * @date 2020/5/20
 * @description: demo2
 * 枚举
 **/

public class Demo2 {
    public static void main(String[] args) {
        // TODO
        // FIXME
        // 枚举静态导入包，直接使用常量即可
        EnumDemo enumDemo1 = FRIDAY;
        EnumDemo enumDemo = EnumDemo.FRIDAY;
        EnumDemo[] enumDemos = enumDemo.values();
        for (EnumDemo demo : enumDemos) {
            System.out.println(demo);
        }
        System.out.println(enumDemo1.ordinal());

    }
}
