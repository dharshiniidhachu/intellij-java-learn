package com.dharshini.learning.java.wiproassessment.loop;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        while (n!=0){
            int ld = n%10;
            sum = sum + ld;
            n/=10;
        }
        System.out.println(sum);
    }
}
