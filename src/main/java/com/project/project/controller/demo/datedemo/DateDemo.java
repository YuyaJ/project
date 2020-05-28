package com.project.project.controller.demo.datedemo;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

/**
 * @author shenya.ji.o
 * @date 2020/5/22
 * @description: date
 **/

public class DateDemo {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(2020, 11, 20);
        System.out.println(localDate);

        String date = "2020-05-20T13:33:33";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.parse(date, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        ZoneId zoneId = ZoneId.systemDefault();
        ZonedDateTime zonedDateTime = localDateTime.atZone(zoneId);
        System.out.println(zonedDateTime);
        System.out.println(zonedDateTime.toInstant().toEpochMilli());

        System.out.println(localDateTime);
        System.out.println(localDateTime.atZone(zoneId).toInstant().toEpochMilli());
        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.getDayOfYear());
        System.out.println(localDateTime.get(ChronoField.DAY_OF_YEAR));
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfWeek());

        String d = localDateTime.format(dateTimeFormatter);
        System.out.println(d);
    }
}
