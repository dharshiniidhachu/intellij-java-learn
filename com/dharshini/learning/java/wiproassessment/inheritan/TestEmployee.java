package com.dharshini.learning.java.wiproassessment.inheritan;

public class TestEmployee {
    public static void main(String[] args) {
        Employee e = new Employee("ABC",40000.00,2025,"123");
        System.out.println(e.getName());
        System.out.println(e.getAnnualSalary());
        System.out.println(e.getStartYear());
        System.out.println(e.getInsuranceNum());
    }
}
