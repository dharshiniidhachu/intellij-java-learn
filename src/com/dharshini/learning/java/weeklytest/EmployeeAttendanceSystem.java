package com.dharshini.learning.java.weeklytest;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileStore;
import java.time.LocalDateTime;
import java.util.*;

public class EmployeeAttendanceSystem {
    public static void main(String[] args) {

        HashMap<Integer, ArrayList<LocalDateTime>> employee = new HashMap<>();

        for ( int i = 101;i<=110;i++){
            employee.put(i,new ArrayList<>());
        }

        System.out.println("Welcome to the Employee Attendance System");

        Scanner sc = new Scanner(System.in);

        while(true){

        System.out.println("1.View Attendance");
        System.out.println("2.Mark Attendance");
        System.out.println("3.EXit and save report");
        System.out.println("Enter your choice: ");

        int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Enter Employee ID: ");
                int id = sc.nextInt();
                if (employee.containsKey(id)) {
                    ArrayList<LocalDateTime> attendance = employee.get(id);
                    if(attendance.isEmpty()) {
                        System.out.println("No attendance records found for employee : " + id);
                    }else{
                        System.out.println("Attendance for Employee ID" + id );
                        for(LocalDateTime record : attendance){
                            System.out.println(record);
                        }
                    }
                }
                else {
                    System.out.println("Invalid ID");
                }
            }
            else if (choice == 2) {
                System.out.println("Enter Employee ID: ");
                int id = sc.nextInt();
                if (employee.containsKey(id)) {
                    LocalDateTime currentTime = LocalDateTime.now();
                    employee.get(id).add(currentTime);
                    System.out.println("Attendance for employye" + id + " : " + currentTime);
                }else{
                    System.out.println("Invalid Employee ID");
                }
            }

            else if (choice == 3) {
                try(FileWriter writer = new FileWriter("Attendance.txt")){
                    for(Integer id : employee.keySet()) {
                        writer.write("Employee ID: " + id + "\n") ;
                        for(LocalDateTime record : employee.get(id)){
                            writer.write(" : " + record + "\n");
                        }
                        writer.write("\n");
                    }
                    System.out.println("Attendance report saved successfully");

                } catch (IOException e) {
                    System.out.println("An error ocurred");
                    e.printStackTrace();
                }
                System.out.println("Exiting..");
                break;

            } else {
                System.out.println("Enter valid choice");
            }
        }
    }
}
