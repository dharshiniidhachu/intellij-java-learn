package com.dharshini.learning.java.college;

import java.util.Scanner;

public class PrimeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum =0;
        for(int i =0;i<=m;i++){
            int max = 0;
            int min = 0;
            if(i>max){
                max = i;
                sum = sum + max;
            }
            if(i<min){
                min = i;
                sum = sum + min;
            }
        }
        System.out.println(sum);

    }
}