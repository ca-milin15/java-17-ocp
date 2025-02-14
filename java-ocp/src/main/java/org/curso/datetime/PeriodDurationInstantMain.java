package org.curso.datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodDurationInstantMain {

    public static void main(String[] args) {

        // Period only just for date and localDate
        var period = Period.ofDays(16);
        System.out.println("Period: %s".formatted(period));

        var period2 = Period.of(2, 2, 2);
        System.out.println("Period2: %s".formatted(period2));

        var period3 = Period.of(3, 0, 16);
        var localdate = LocalDate.now();
        System.out.println("localdate: %s".formatted(localdate.plus(period3)));


        // Duration only just for LocalTime and localDateTime. When printout, it will show in hours
        var durationDays = Duration.ofDays(2);
        System.out.println("durationDays: %s".formatted(durationDays)); // PT48H

        var durationHour = Duration.ofHours(2);
        System.out.println("durationHour: %s".formatted(durationHour)); // PT2H

        var durationMinutes = Duration.ofMinutes(90);
        System.out.println("durationMinutes: %s".formatted(durationMinutes)); // PT90M

        var durationSecond = Duration.ofSeconds(30);
        System.out.println("durationSecond: %s".formatted(durationSecond)); // PT30S

        var durationMillis = Duration.ofMillis(30);
        System.out.println("durationMillis: %s".formatted(durationMillis)); // PT0.03S

        var durationNanos = Duration.ofNanos(30);
        System.out.println("durationNanos: %s".formatted(durationNanos)); // PT0.00000003S

        var localDateTime = LocalDateTime.now();
        System.out.println("localDateTime with duration: %s".formatted(localDateTime.plus(durationMinutes)));

        var durationHalfDays = Duration.of(1, ChronoUnit.HALF_DAYS);
        System.out.println("durationHalfDays: %s".formatted(durationHalfDays)); // PT12H


        System.out.println(ChronoUnit.HOURS.between(LocalDateTime.now(), localDateTime.plus(durationMinutes))); // 1
        System.out.println(ChronoUnit.HOURS.between(LocalDateTime.now(), localDateTime.plus(durationHour))); // 1
        System.out.println(ChronoUnit.MINUTES.between(LocalDateTime.now(), localDateTime.plus(durationHour))); // 119

    }
}
