package com.dharshini.learning.java.exam;

import com.dharshini.learning.java.date.moderndate.CalculateAge;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Age {

    public static void main(String[] args) {
        CalculateAge calculateAge = new CalculateAge();
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Enter your dob: ");
        System.out.println(calculateAge.getMyAge(LocalDate.parse(sc.nextLine(),formatter)));

    }
}
