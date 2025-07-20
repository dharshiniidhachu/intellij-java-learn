package com.dharshini.learning.java.college;

import java.util.Scanner;

public class FactorialZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 0;
        int count = 0;
        while (n>=0){
            fact = n *(n-1);
            int ld = fact %10;
            if(ld==0) {
                count++;
            }
            n = fact/10;
        }
        System.out.println(count);
    }
}
