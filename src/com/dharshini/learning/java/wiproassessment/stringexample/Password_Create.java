package com.dharshini.learning.java.wiproassessment.stringexample;

import java.util.Scanner;

public class Password_Create {
    public static String[] encode(String word) {
        int length = word.length();
        int p1 = length/3;
        int p3 = length/3;
        int p2 = length%3 + length/3;

        String part1 = word.substring(0,p1);
        String part2 = word.substring(p1,p1+p2);
        String part3 = word.substring(p1+p2);

        return new String[] {part1,part2,part3};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        String[] word1 = encode(s1);
        String[] word2 = encode(s2);

        String pass = word2[0] + word1[0] + word1[2] + word2[2];
        System.out.println(pass);
    }
}
