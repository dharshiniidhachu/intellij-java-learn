package com.dharshini.learning.java.college;

import java.util.Scanner;

public class RepeatedDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j>=i; j++) {
                if (i == j) {
                    count++;
                }
            }
        }
            System.out.println(count);
    }
}
