package com.dharshini.learning.java.wiproassessment.IfStatement;

import java.util.Scanner;

public class OddEven {
     static void check(int n){
        if(n%2==0){
            System.out.println("Even Number");
        }else {
            System.out.println("Odd Number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        OddEven.check(n);
    }
}
