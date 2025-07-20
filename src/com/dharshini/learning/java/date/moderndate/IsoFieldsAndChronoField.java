package com.dharshini.learning.java.date.moderndate;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsoFieldsAndChronoField {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();

        int WeekOfYear = currentDate.get(java.time.temporal.IsoFields.WEEK_OF_WEEK_BASED_YEAR);
        System.out.println(WeekOfYear);

        int DayOfWeek = currentDate.get(ChronoField.DAY_OF_WEEK);
        System.out.println(DayOfWeek);
    }
}
