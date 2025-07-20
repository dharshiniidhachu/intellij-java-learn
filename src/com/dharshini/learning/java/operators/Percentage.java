package com.dharshini.learning.java.operators;

import java.util.Scanner;
import java.lang.System;

public class Percentage {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter mark1");
        int m1 = scanner.nextInt();
        System.out.println("Enter mark2");
        int m2 = scanner.nextInt();
        System.out.println("Enter mark3");
        int m3 = scanner.nextInt();
        System.out.println("Enter mark4");
        int m4 = scanner.nextInt();
        System.out.println("Enter mark5");
        int m5 = scanner.nextInt();

        int percent = (m1+m2+m3+m4+m5)/5;

        System.out.println("com.dharshini.learning.java.operators.Percentage = " + percent);
        scanner.close();
    }
}
