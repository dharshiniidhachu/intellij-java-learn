package com.dharshini.learning.java.string;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name : " );
        String name = sc.next();
        System.out.println( name + " have a good day");
    }
}
