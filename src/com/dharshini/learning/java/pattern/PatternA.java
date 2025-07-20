package com.dharshini.learning.java.pattern;

import java.util.Scanner;

public class PatternA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int rows=1;rows<=n;rows++){
            for(int col=1;col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
