package com.dharshini.learning.java.wrapperclass;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: " );
        String s = sc.nextLine();
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        s=s.toUpperCase();
        if(n==1) {
            s= s.replaceAll("[AEIOU]","");
        }
        int weight = 0;
        for(int i = 0;i<s.length();i++) {
            if(Character.isAlphabetic(s.charAt(i))) {
                weight = weight +(s.charAt(i)-64);
            }
        }
        System.out.println(weight);
    }
}
