package com.dharshini.learning.java.pattern;

import java.util.Scanner;

public class PatternG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1;i<=n;i++){
            for(int j =1;j<=n-(i-1);j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
