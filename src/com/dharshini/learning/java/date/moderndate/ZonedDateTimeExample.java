package com.dharshini.learning.java.date.moderndate;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeExample {

    public static void main(String[] args) {

        ZonedDateTime currentZoneDateTime = ZonedDateTime.now();
        System.out.println("Current Zoned DateTime: " + currentZoneDateTime);

        ZoneId zoneId = ZoneId.of("Asia/Kolkata");

        ZonedDateTime indiaTime = ZonedDateTime.now(zoneId);

        System.out.println("DateTime in India Time Zone: " + indiaTime);

        System.out.println("Available Time Zones: " +ZoneId.getAvailableZoneIds());


    }
}
