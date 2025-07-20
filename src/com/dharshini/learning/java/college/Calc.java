package com.dharshini.learning.java.college;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;
        while (n >= 1) {
            if (m == 2) {
                if (n %2 == 0) {
                    sum = sum + n;
                    n--;
                } else {
                    sum = sum - n;
                    n--;
                }
            }
            if(m ==1) {
                if(n%2!=0){
                    sum = sum - n;
                    n--;
                } else {
                    sum = sum + n;
                    n--;
                }
            }
        }
        System.out.println(sum);


    }

}