package com.dharshini.learning.java.date.calendar;

import java.util.Calendar;

public class CalendarExample {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();//singleton object

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) +1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("Current date: " + day + "-" + month + "-" + year);

        calendar.add(Calendar.DAY_OF_MONTH, 10);
        System.out.println("After adding 10 days: " + calendar.get(Calendar.DAY_OF_MONTH) + "-" + (calendar.get(Calendar.MONTH) +1) + "-" + calendar.get(Calendar.YEAR));

        calendar.add(Calendar.DAY_OF_MONTH, -5);
        System.out.println("After subtracting 5 days: " + calendar.get(Calendar.DAY_OF_MONTH) + "-" + (calendar.get(Calendar.MONTH) +1) + "-" + calendar.get(Calendar.YEAR));

        calendar.set(2004, Calendar.SEPTEMBER, 18);
        System.out.println("Custom Date Set: " + calendar.get(Calendar.DAY_OF_MONTH) + "-" + (calendar.get(Calendar.MONTH) +1) + "-" + calendar.get(Calendar.YEAR));

        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        System.out.println("Time: " + hour + ":" + minute + ":" + second);

        int firstDayOfWeek = calendar.getFirstDayOfWeek();
        System.out.println(firstDayOfWeek);

        int weeksInWeekYear = calendar.getWeeksInWeekYear();
        System.out.println("Weeks in a year: " + weeksInWeekYear);




    }
}
