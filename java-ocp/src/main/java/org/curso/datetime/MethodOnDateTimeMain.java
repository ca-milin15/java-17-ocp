package org.curso.datetime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class MethodOnDateTimeMain {

    public static void main(String... args) {

        var localDateTime = LocalDateTime.now();
        System.out.println("Fecha: %s, mas 2 dias: %s".formatted(localDateTime, localDateTime.plusDays(2)));

        var zonedDateTime = ZonedDateTime.now();
        System.out.println("ZonedDateTime: %s, mas 2 meses: %s".formatted(zonedDateTime, zonedDateTime.plusMonths(2)));

        var localTime = LocalTime.now();
        System.out.println("localTime: %s".formatted(localTime));
        localTime.plusHours(1).plusNanos(15);
        System.out.println("localTime updated: %s".formatted(localTime)); // Date and Hours classes are immutable!
    }
}
