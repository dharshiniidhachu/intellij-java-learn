package com.dharshini.learning.java.collections.map;

import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {

        HashMap<Integer, Employee> employee = new HashMap<>();
        employee.put(1,(new Employee(101,"Dharshini", "Employee1", "Analyst", 35000.00)));
        employee.put(2,(new Employee(102,"Dharshini", "Employee2", "Developer", 45000.00)));
        employee.put(3,(new Employee(103,"Dharshini", "Employee3", "Designer", 30000.00)));
        employee.put(4,(new Employee(104,"Shalini", "Employee4", "Developer", 45000.00)));
        employee.put(5,(new Employee(105,"Shalini", "Employee5", "Analyst", 35000.00)));
        employee.put(6,(new Employee(106,"Shalini", "Employee6", "Designer", 30000.00)));
        employee.put(7,(new Employee(107,"Shalini", "Employee7", "Marketing", 25000.00)));
        employee.put(8,(new Employee(108,"Dharshini", "Employee8", "Marketing", 25000.00)));
        employee.put(9,(new Employee(109,"Dharshini", "Employee9", "Tester", 32000.00)));
        employee.put(10,(new Employee(110,"Shalini", "Employee10", "Tester", 32000.00)));

        System.out.println("Employees under the Manager Dharshini:");
        for(Employee a : employee.values()) {
            if(a.getManagerName().equals("Dharshini")){
                System.out.println("Name: " + a.getEmployeeName() + ", Designation: " + a.getDesignation() + ", Salary:" + a.getSalary());
            }
        }
    }
}
