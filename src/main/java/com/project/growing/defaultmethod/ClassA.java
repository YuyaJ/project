package com.project.growing.defaultmethod;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

/**
 * @author jsy
 * @description: 1
 **/

public class ClassA implements InterfaceB,InterfaceC{

    @Override
    public void foo() {
        InterfaceB.super.foo();
        InterfaceC.super.foo();
    }

    public static void main(String[] args) {
//        ClassA classA = new ClassA();
//        classA.foo();

//        Map<String,Boolean> map =  new HashMap<String, Boolean>();
//        Boolean b = (map!=null ? map.get("Hollis") : false);

        String date = "2020-05-07 14:08";
//        LocalDate localDate = LocalDate.parse(date, DateTimeFormatter.BASIC_ISO_DATE);
//        System.out.println(localDate);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime parse = LocalDateTime.parse(date,df);
        System.out.println(parse.toInstant(ZoneOffset.ofHours(8)).toEpochMilli());
    }
}
