package com.dharshini.learning.java.classobjects;

import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        int a,b,sum;
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter a :");
        a = sc.nextInt();

        System.out.println("Enter b :");
        b = sc.nextInt();

        sum = a+b;
        System.out.println("com.dharshini.learning.java.operators.Sum =" +sum);

    }
}
