package com.dharshini.learning.java.weeklytest;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class EmployeeAttendance {

    static HashMap<Integer, ArrayList<LocalDateTime>> employee = new HashMap<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        empHashMap();

        while (true) {
            System.out.println("Welcome to employee attendance system");
            System.out.println("1.View Attendance");
            System.out.println("2.Mark Attendance");
            System.out.println("3.Exit and save report");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    viewAttendance();
                    break;
                }
                case 2: {
                    markAttendance();
                    break;
                }
                case 3: {
                    exitAndSaveReport();
                    return;
                }
                default: {
                    System.out.println("Invalid choice...Enter the correct choice");
                }
            }
        }
    }

    public static void empHashMap() {
        employee.put(101, new ArrayList<>());
        employee.put(102, new ArrayList<>());
        employee.put(103, new ArrayList<>());
        employee.put(104, new ArrayList<>());
        employee.put(105, new ArrayList<>());
        employee.put(106, new ArrayList<>());
        employee.put(107, new ArrayList<>());
        employee.put(108, new ArrayList<>());
        employee.put(109, new ArrayList<>());
        employee.put(110, new ArrayList<>());
    }

    public static void viewAttendance() {
        System.out.println("Enter Employee ID: ");
        int id = sc.nextInt();
        System.out.println("Attendance for Employee ID " + id);
        int count = 1;
        if (employee.get(id).size() > 0) {
            for (LocalDateTime record : employee.get(id)) {
                System.out.println("Attendance: " + count++ + employee.toString());
            }
        } else {
            System.out.println("No records found for employee ID: " + id);
        }
    }

    public static void markAttendance() {
        System.out.println("Enter Employee ID: ");
        int id = sc.nextInt();
        employee.get(id).add(LocalDateTime.now());
        System.out.println("Attendace marked for employee ID: " + id);
    }

    public static void exitAndSaveReport() {
        try (FileWriter writer = new FileWriter("Attendance1.txt")) {
            for (Integer key : employee.keySet()) {
                writer.write("Employee ID: " + key + "\n");
                for (LocalDateTime time : employee.get(key)) {
                    writer.write("Attendance: " + time + "\n");
                }
                writer.write("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }}
