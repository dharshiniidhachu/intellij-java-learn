package com.dharshini.learning.java.wiproassessment.IfStatement;

import java.util.Scanner;

public class InterestPercent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Female or Male: ");
        String gender = sc.next();
        int age = sc.nextInt();
        if(gender.equalsIgnoreCase("Female")){
            if(age>=1 && age<=58){
                System.out.println("8.2%");
            } else if (age>=59 && age<=100) {
                System.out.println("9.2%");
            }else {
                System.out.println("Invalid age");
            }
        } else if (gender.equalsIgnoreCase("Male")) {
            if(age>=1 && age<=58){
                System.out.println("8.4%");
            } else if (age>=59 && age<=100) {
                System.out.println("10.5%");
            }else {
                System.out.println("Invalid age");
            }

        }
    }
}
