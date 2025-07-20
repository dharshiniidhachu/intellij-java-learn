package com.dharshini.learning.java.college;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = sc.nextLine();

        System.out.println("Enter gender: ");
        String gender = sc.nextLine();

        System.out.println("Enter age: " );
        int age = sc.nextInt();

        System.out.println("Enter mark: " );
        int mark = sc.nextInt();

        System.out.println("STUDENT MANAGEMENT SYSTEM");
        System.out.println("--------------------------------");

        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(mark);

    }
}
