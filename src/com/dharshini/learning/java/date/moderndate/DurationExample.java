package com.dharshini.learning.java.date.moderndate;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class DurationExample {
    public static void main(String[] args) {
        LocalTime startTime = LocalTime.of(11,30);
        LocalTime endTime = LocalTime.of(4,0);

        Duration duration = Duration.between(startTime,endTime);
        System.out.println("duration:" + duration.toHours() + "hours" + duration.toMinutes() %60 + "minutes");

        LocalDate startDate = LocalDate.of(2004,9,18);
        LocalDate endDate = LocalDate.of(2024,12,19);

        Period period = Period.between(startDate,endDate);
        System.out.println("Duration between date: " + period.getYears() + "Years" + period.getMonths() + "Months" + period.getDays() + "Days");

    }
}
