package com.project.growing.demo.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author shenya.ji.o
 * @date 2020/6/2
 * @description: 懒汉单例模式
 **/

public class TestLazy {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, IOException, ClassNotFoundException {
        SingletonLazy singletonLazy1 = SingletonLazy.getInstance();
        SingletonLazy singletonLazy2 = SingletonLazy.getInstance();
        System.out.println(singletonLazy1.hashCode());
        System.out.println(singletonLazy2.hashCode());

        // 反射破坏单例模式
//        Class<SingletonLazy> singletonLazyClass = SingletonLazy.class;
//        Constructor<SingletonLazy> singletonLazyConstructor = singletonLazyClass.getDeclaredConstructor();
//        singletonLazyConstructor.setAccessible(true);
//        SingletonLazy singletonLazy3 = singletonLazyConstructor.newInstance();
//        System.out.println(singletonLazy3.hashCode());

        // 序列化破坏单例
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("tempfile"));
        objectOutputStream.writeObject(SingletonLazy.getInstance());
        File file = new File("tempfile");
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        Object ob = objectInputStream.readObject();
        SingletonLazy singletonLazy4 = (SingletonLazy)ob;
        System.out.println(ob.hashCode());
        System.out.println(singletonLazy4.hashCode());

    }
}
