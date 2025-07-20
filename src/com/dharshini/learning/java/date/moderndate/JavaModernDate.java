package com.dharshini.learning.java.date.moderndate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JavaModernDate {

    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();
        System.out.println("Current date: " + currentDate);

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time : " + currentDateTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = currentDate.format(formatter);
        System.out.println("Formatted Date: " +formattedDate);

        String dateString = "18-09-2024";
        LocalDate parsedDate = LocalDate.parse(dateString, formatter);
        System.out.println("Parsed Date: " + parsedDate);

        LocalDate futureDate = currentDate.plusDays(10);
        System.out.println("Future Date (after 10 days): " +futureDate);

        LocalDate pastDate = currentDate.minusDays(5);
        System.out.println("Past Date (5 days ago): " + pastDate);

    }
}
