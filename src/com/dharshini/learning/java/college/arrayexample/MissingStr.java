package com.dharshini.learning.java.college.arrayexample;

import java.util.Scanner;

public class MissingStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i)!=s2.charAt(i)){
                System.out.println(s1.charAt(i));
            }
        }
    }
}