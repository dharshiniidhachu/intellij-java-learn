package com.dharshini.learning.java.controlstatements;

public class ControlStatementPractice {
    public static void main(String[] args) {

        int n = -12;
        if(n>0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
        }

        System.out.println("Numbers from 1 to 8 using for loop:");
        for(int i=1;i<=8;i++){
                System.out.println(i +" ");
            }
        System.out.println();

        System.out.println("Numbers from 1 to 5 using for loop and print statement:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Grades using switch");
        char grade= 'D';
        switch(grade){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            default:
                System.out.println("Keep trying...");
        }

        System.out.println("Reversing the numbers from 1 to 10 using while loop :");
        int count = 10;
        while(count>0){
            System.out.print(count + " ");
            count--;
        }
        System.out.println();

        System.out.println("Odd numbers from 1 to 10 using continue: ");
        for(int i=1;i<10;i++){
            if(i%2==0)
                continue;
            System.out.print(i + " ");
            }
        System.out.println();

        System.out.println("Break statement : ");
        for(int i=1;i<5;i++){
            if(i==4)
                break;
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Return Statement:");
        for(int i=1;i<5;i++){
            if(i==3)
                return;
            System.out.print(i + " ");
        }
        System.out.println();
        }

        }

