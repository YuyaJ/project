package com.project.project.controller.demo.beanutils;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestDemoTest {

    @Test
    public void test(){
        Employee employee1 = new Employee("A", 21, "it");
        Employee employee2 = new Employee("B", 23, "his");
        User user = new User();
        BeanUtils.copyProperties(employee2, user);
        System.out.println(user);
    }
}