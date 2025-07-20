package com.dharshini.learning.java.string;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter word1: ");
        String word1 = sc.nextLine();

        System.out.println("Enter word2: ");
        String word2 = sc.nextLine();

        boolean b = word1.indexOf(0) == word2.indexOf(0);
        System.out.println(b);


    }
}
