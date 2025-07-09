package com.dharshini.learning.java.wiproassessment.IfStatement;

import java.util.Scanner;

public class CheckNumber {
    static void check(int n){
        if (n==0){
            System.out.println("Zero");
        }else if(n>0) {
            System.out.println("Positive Number");
        }else {
            System.out.println("Negative Number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        CheckNumber.check(n);



    }
}
