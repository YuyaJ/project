package com.project.growing;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

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