package com.project.project.controller.demo.beanutils;

import lombok.*;

import javax.validation.constraints.NotNull;

/**
 * @author shenya.ji.o
 * @date 2020/5/21
 * @description: employee
 **/
@Getter
@Setter
@ToString
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class Employee {
    @NonNull private String name;
    @NotNull private Integer age;
    private String content;
}
