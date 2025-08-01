package com.dharshini.learning.java.pattern;

import java.util.Scanner;

public class Diamond2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of.rows: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++)
                System.out.print(" ");
            for(int j=1; j<=i; j++)
                System.out.print("* ");
            System.out.println();
        }

        for(int i=n-1;i>=1;i--){
            for(int j=1; j<=n-i; j++)
                System.out.print(" ");
            for(int j=1; j<=i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
