package com.project.growing;

import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @author jsy
 * @description: test
 **/
@RestController
public class TestController {
    public static void main(String[] args) {
        float diff = 1e-6f;
        System.out.println(diff);
    }

    public BigDecimal add(int numA, int numB){
        BigDecimal numTotal = new BigDecimal("0");
        numTotal = new BigDecimal(numA).add(new BigDecimal(numB));
        return numTotal;
    }
}
