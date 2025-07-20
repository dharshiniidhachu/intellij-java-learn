package com.dharshini.learning.java.college;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 2; i <= n; i++) { //number from 2 checking prime is i
            boolean prime = true; //i is prime assume
            for (int j = 2; j <= i/ 2; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                sum = sum + i;
                System.out.println(i);
            }
        }
        System.out.println(sum);
    }
}