package com.dharshini.learning.java.exam;

import java.util.ArrayList;

public class EmployeeApp {
    public static void main(String[] args) {
        ArrayList<Employee> employee = new ArrayList<>();
        employee.add(new Employee(1,"mary","analyst"));
        employee.add(new Employee(2,"rashmi","sales"));
        employee.add(new Employee(3,"priya","logistics"));
        employee.add(new Employee(4,"ram","logistics"));
        employee.add(new Employee(5,"lila","design"));
        employee.add(new Employee(6,"preethi","sales"));
        employee.add(new Employee(7,"hansi","developer"));
        employee.add(new Employee(8,"siddhu","analyst"));
        employee.add(new Employee(9,"harshath","sales"));
        employee.add(new Employee(10,"sivangi","developer"));

        int count = 0;

        for(Employee emp : employee){
            if(emp.dept.equals("sales"))
            {
                emp.setDept("marketing");
                count++;

            }
        }
        System.out.println(count);

    }
}