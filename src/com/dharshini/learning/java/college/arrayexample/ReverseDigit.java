package com.dharshini.learning.java.college.arrayexample;

import javax.script.ScriptContext;
import java.util.Scanner;

public class ReverseDigit {
    public static int reverseArr(int n){
        int rev = 0;
        while(n!=0) {
            int digit = n%10;
            rev = rev *10+digit;
            n = n/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int result = reverseArr(n);
        System.out.println(result);

    }
}
