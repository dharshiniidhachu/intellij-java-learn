package com.dharshini.learning.java.college.arrayexample;

import java.util.Scanner;

public class GcdUsingMin {
    static int GreatestCommon(int a,int b){
        int min = Math.min(a,b);
        while (min>0) {
            if (a % min == 0 && b % min == 0) {
                break;
            }
            min--;
        }
        return min;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(GreatestCommon(a,b));

    }
}
