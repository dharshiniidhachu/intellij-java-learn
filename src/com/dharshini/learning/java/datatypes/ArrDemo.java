package com.dharshini.learning.java.datatypes;

import java.util.Scanner;

public class ArrDemo {
    int i = 50;
    static int s =30;
    public static void main(String[] args) {
        System.out.print("Enter a Word: ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        System.out.println(ch);

        //static,local,instance variable

        int l=12;
        System.out.println(l);
        ArrDemo d = new ArrDemo();
        System.out.println(d.i);
        System.out.println(s);
    }
}
