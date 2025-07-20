package com.dharshini.learning.java.collections.map;

import com.dharshini.learning.java.innerclass.StaticOuter;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

    public static void main(String[] args) {

        ConcurrentHashMap<String,Integer> employeeSalaries = new ConcurrentHashMap<>();

        employeeSalaries.put("John",55000);
        employeeSalaries.put("Emma",40000);
        employeeSalaries.put("Sophia",50000);

        System.out.println("Employee salaries:");
        employeeSalaries.forEach((name,salary) ->
                System.out.println("Name: " + name + ", Salary: $" + salary));

    }
}
