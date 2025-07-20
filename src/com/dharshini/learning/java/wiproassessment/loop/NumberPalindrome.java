package com.dharshini.learning.java.wiproassessment.loop;

import java.util.Scanner;

public class NumberPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int rev = 0;
        while (n!=0){
            int ld = n%10;
            rev = rev *10+ld;
            n/=10;
        }
        if (original==rev){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not a Palindrome");
        }
    }
}
