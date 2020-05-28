package com.project.project.controller.demo.beanutils;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;

/**
 * @author shenya.ji.o
 * @date 2020/5/21
 * @description: user
 **/
@Getter
@Setter
@ToString
public class User {
    @NotNull private String name1;
    private Integer age;
}
