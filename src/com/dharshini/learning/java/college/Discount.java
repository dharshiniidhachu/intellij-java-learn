package com.dharshini.learning.java.college;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int sum = 0;
        while (n!=0) {
            int ld = n%10;
            if(n%2!=0) {
                sum = sum + ld;
            }
            n = n/10;
        }
        System.out.println(sum);
    }
}
