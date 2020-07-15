package com.project.growing.demo.beanutils;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;

/**
 * @author jsy
 * @date 2020/5/21
 * @description: user
 **/
@Getter
@Setter
@ToString
public class User {
    @NotNull private String name;
    @NotNull private Integer age;
}
