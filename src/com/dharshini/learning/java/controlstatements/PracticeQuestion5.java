package com.dharshini.learning.java.controlstatements;

import java.util.Scanner;

public class PracticeQuestion5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number1: ");
        float num1= sc.nextFloat();

        System.out.println("Enter number2: ");
        float num2= sc.nextFloat();

        if(num1==num2){
            System.out.println("Same");
        }
        else{
            System.out.println("Not Same");
        }
    }
}
