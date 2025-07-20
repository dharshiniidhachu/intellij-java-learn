package com.dharshini.learning.java.college;

import java.util.Scanner;

public class OddEvenProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int evenSum =0;
        int oddSum = 0;
        while (n!=0) {
                int ld = n%10;
                if(ld%2==0){
                    evenSum = evenSum + ld;
                    n = n/10;
            }
                else {
                    oddSum = oddSum + ld;
                    n=n/10;
                }
        }
        System.out.println(evenSum * oddSum);
    }
}
