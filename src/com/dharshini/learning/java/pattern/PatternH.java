package com.dharshini.learning.java.pattern;

import java.util.Scanner;

public class PatternH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1;i<=n;i++){
            //n-(i-1) can be written as n-i+1 since both are same
            for(int j=1;j<=n-i+1;j++) {
                System.out.print(n-i+1 + " ");
            }
            System.out.println();
        }
    }
}
