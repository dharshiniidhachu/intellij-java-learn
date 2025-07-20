package com.dharshini.learning.java.college;

import java.util.Scanner;

public class AreaOfLargestTri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b1 = sc.nextInt();
        int h1 = sc.nextInt();
        int b2 = sc.nextInt();
        int h2 = sc.nextInt();
        float a1 = (b1*h1) /2;
        float a2 = (b2*h2) /2;
        if(a1>a2){
            System.out.printf("%.2f",a1);
        }else {
            System.out.printf("%.2f",a2);
        }
    }
}
