package org.curso.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class CreateDateTimeMain {

    public static void main (String[] args) {

        var localDate = LocalDate.now();
        System.out.println(localDate);

        var localTime = LocalTime.now();
        System.out.println(localTime);

        var localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        var zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);
    }
}
