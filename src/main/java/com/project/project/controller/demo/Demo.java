package com.project.project.controller.demo;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess;

import java.util.*;

/**
 * @author jsy
 * @description: demo
 **/

public class Demo {
    public static void main(String[] args) {

        Integer a = 1;
        Integer b = 2;
        Integer c = null;
        Boolean flag = false;
        Integer result = flag ? a*b : c;

        Integer num = 1;

        System.out.println(1 == num);
        System.out.println("1".equals(num));
        System.out.println("1".equals(String.valueOf(num)));
        System.out.println(Objects.equals(1, num));

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("1");
        list.add("3");

        Set<String> set = new HashSet<>();
        list.forEach(set::add);

        list.clear();
        list.addAll(set);

        System.out.println(list);

        list.removeIf("2"::equals);

        System.out.println(list);

        Map<String, String> map = new HashMap<>(16);
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");
        map.put(null, null);

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        map.forEach((key, value)->{
            System.out.println(key + ":" + value);
        });

    }
}
