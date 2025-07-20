package com.dharshini.learning.java.pattern;

import java.util.Scanner;

public class RightTriangleOdd {
    public static void main(String[] args) {
        int n=5;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of.rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - 1; j++)
                System.out.print(" ");
            for (int j = 1; j <= 2 *i-1; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
 */
