package com.dharshini.learning.java.oops.encap;

public class EmployeeApp {
    public static void main(String[] args) {
        Employee e = new Employee("Dhachu","12",80000);
        System.out.println("Salary: " + e.getSalary());
        e.bCalculate(20);
        System.out.println(e.getSalary());
    }
}
