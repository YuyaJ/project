package com.project.growing.demo.beanutils;

import lombok.*;

import javax.validation.constraints.NotNull;

/**
 * @author jsy
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
    @NonNull private String content;
}
