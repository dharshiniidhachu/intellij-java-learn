package com.dharshini.learning.java.test;

import java.util.HashMap;
import java.util.Scanner;

class AmountNonSufficient extends Exception {
    public AmountNonSufficient(String message) {
        super(message);
    }
}

public class EmployeeApp {
    public static void main(String[] args) {

        HashMap<Integer, Employee> employee = new HashMap<>();

        employee.put(1, new Employee(1, "Dhachu", "DataEngineer", 26, 55000.00, "8654323456"));
        employee.put(2, new Employee(2, "Shalu", "DataEngineer", 26, 55000.00, "8765434567"));
        employee.put(3, new Employee(3, "Gowtham", "DataAnalyst", 24, 50000.00, "9876543234"));
        employee.put(4, new Employee(4, "Nandhini", "DataAnalyst", 23, 50000.00, "9678423589"));
        employee.put(5, new Employee(5, "Ram", "BackendDeveloper", 29, 50000.00, "8654323467"));
        employee.put(6, new Employee(6, "Harshath", "BackendDeveloper", 27, 50000.00, "8654323487"));
        employee.put(7, new Employee(7, "Khan", "FrontendDeveloper", 32, 45000.00, "8654323654"));
        employee.put(8, new Employee(8, "Siddhu", "FrontendDeveloper", 30, 45000.00, "86543234786"));
        employee.put(9, new Employee(9, "Bala", "FrontendDeveloper", 29, 45000.00, "8654323432"));
        employee.put(10, new Employee(10, "Jack", "FrontendDeveloper", 30, 45000.00, "8654323876"));
        employee.put(11, new Employee(11, "Vijay", "FrontendDeveloper", 25, 45000.00, "8654323875"));
        employee.put(12, new Employee(12, "Ajith", "FrontendDeveloper", 28, 45000.00, "8654323874"));
        employee.put(13, new Employee(13, "Trisha", "Designer", 29, 25000.00, "8654323873"));
        employee.put(14, new Employee(14, "Arjun", "Designer", 30, 25000.00, "8654323872"));
        employee.put(15, new Employee(15, "Sam", "Designer", 26, 25000.00, "8654323871"));
        employee.put(16, new Employee(16, "Kaviya", "Designer", 27, 25000.00, "8654313876"));
        employee.put(17, new Employee(17, "Keerthi", "Designer", 28, 25000.00, "7654323876"));
        employee.put(18, new Employee(18, "Siva", "DigitalMarketing", 29, 18000.00, "9654323876"));
        employee.put(19, new Employee(19, "Karthi", "DigitalMarketing", 30, 18000.00, "9854323876"));
        employee.put(20, new Employee(20, "Surya", "DigitalMarketing", 31, 18000.00, "9764323876"));

        double balance = 500000;

        for (Employee a : employee.values()) {

            try {
                if (balance >= a.getSalary()) {
                    balance = balance - a.getSalary();
                    System.out.println("Balance for employee: " + balance);
                    System.out.println("Salary for : " + a.getName() + " is credited " + a.getSalary() + " Remaining balance in acct is : " + balance);
                } else {
                    throw new AmountNonSufficient("provide enough balance");
                }

            } catch (AmountNonSufficient ae) {

                System.out.println(ae.getMessage());
                System.out.println("Salary for : " + a.getName() + " is not sufficient : " + a.getSalary() +" Deposit more money to continue the salary process : ");
                Scanner scanner = new Scanner(System.in);
                double newDepostAmt = scanner.nextDouble();
                if (newDepostAmt > ( a.getSalary() - balance)) {

                    balance = balance + newDepostAmt;
                    balance = balance - a.getSalary();
                    System.out.println("Salary for : " + a.getName() + " is credited " + a.getSalary() + " Remaining balance in acct is : " + balance);

                } else {
                    System.out.println("Deposit amount should be higher than the salary for " + a.getName() + " and salary is : " + a.getSalary());
                }
            }
        }
        System.out.println("Salary has been processed for all the employee and remaining in company acct is : " + balance);
    }
}