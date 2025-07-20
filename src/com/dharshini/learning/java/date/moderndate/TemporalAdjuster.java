package com.dharshini.learning.java.date.moderndate;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjuster {
    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();

        LocalDate lastDayOfMonth = currentDate.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("Last day of month: " + lastDayOfMonth);

        LocalDate firstDayOfMonth = currentDate.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println("First day of month : " + firstDayOfMonth);

        LocalDate c = currentDate.with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println("First day of next month: " + c);

        LocalDate d = currentDate.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
        System.out.println("Next day of week: " +d);

    }
}
