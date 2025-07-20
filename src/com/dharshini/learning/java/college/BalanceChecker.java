package com.dharshini.learning.java.college;

import java.util.Scanner;

public class BalanceChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ur balance: ");
        float balance = sc.nextFloat();
        if(balance<0 ) {
            System.out.println("Error: Invalid balance entered.");
        }
        else if(balance >=0  & balance<1000) {
            System.out.println("Alert! Your balance is low.");
        } else if (balance ==1000 & balance > 1000) {
            System.out.println("Your balance is sufficient.");
        }
        else {
            System.out.println("Enter valid nuumber");
        }

    }
}
