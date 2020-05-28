package com.project.project.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class TestControllerTest {

    @Test
    void main() {
    }

    @Test
    void testAdd() {
        int numA = 2;
        int numB = 3;
        BigDecimal resultNum = new TestController().add(numA, numB);
        System.out.println(resultNum);
    }
}