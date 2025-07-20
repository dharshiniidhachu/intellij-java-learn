package com.dharshini.learning.java.operators;

import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int num = sc.nextInt();
        System.out.println("Last digit: " +num%10);

    }
}
