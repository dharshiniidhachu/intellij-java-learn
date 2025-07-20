package com.dharshini.learning.java.pattern;

import java.util.Scanner;

public class PatternE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1;i<=n;i++){
            int start;
            //starting if we need start as 1 in all row give start =1 and skip the below line
            //if we need all start as 0 means give start=0 and skip below line
            start = (i%2==0) ? 0 : 1;
            for (int j =1;j<=i;j++){
                System.out.print(start);
                //now for flipping
                start = (start==1)?0:1;
            }
            System.out.println();
        }
    }
}
