package com.dharshini.learning.java.college;

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);

        if(c=='a'||c=='e'||c=='i'||c=='o'|c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
            System.out.println("Vowel");
        } else if (c>='a' && c<='z' || c>='A' && c<='Z') {
            System.out.println("consonant");
        }
        else {
            System.out.println("Not an alphabet");
        }

    }
}