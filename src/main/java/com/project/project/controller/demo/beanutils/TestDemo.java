package com.project.project.controller.demo.beanutils;

import org.springframework.beans.BeanUtils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @author shenya.ji.o
 * @date 2020/5/21
 * @description: demo
 **/

public class TestDemo {
    public static void main(String[] args) throws Exception {
        // 获取字节码文件
        Class classs = Class.forName("com.project.project.controller.demo.beanutils.Employee");
        // 获取实例对象
        Employee employee = (Employee)classs.newInstance();
        // 对成员变量操作
        Field field = classs.getDeclaredField("name");
        field.setAccessible(true);
        field.set(employee, "张三");
        System.out.println(employee.getName());
        // 获取所有构造函数
        Constructor[] constructor = classs.getConstructors();
        // 遍历所有构造函数
        for (int i = 0; i < constructor.length; i++) {
            // 获取每个构造函数中得参数类型字节码对象
            Class[] parameterTypes = constructor[i].getParameterTypes();
            System.out.println("第"+i+"个构造函数");
            for (int j = 0; j < parameterTypes.length; j++) {
                System.out.println(parameterTypes[j].getName()+",");
            }
        }
    }
}
