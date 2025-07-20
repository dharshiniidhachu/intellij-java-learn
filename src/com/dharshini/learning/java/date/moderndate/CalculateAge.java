package com.dharshini.learning.java.date.moderndate;

import java.time.LocalDate;
import java.time.Period;

public class CalculateAge {

    public String getMyAge(LocalDate dateOfBirth) {
        Period age = Period.between(dateOfBirth,LocalDate.now());
        return "you are "+ age.getYears() + " years " + age.getMonths() +" months " + age.getDays() + " days old";
    }
}
