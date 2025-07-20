package com.dharshini.learning.java.college;

public class Increment {
    public static void main(String[] args) {

    int a = 10;
    int b = ++a;
        System.out.println("b value: " + b);
        System.out.println(a);

    int c = a++ + ++b;
    int d = b++;
        System.out.println(c);
        System.out.println(d);
        System.out.println(++d);

        byte f = 127;
        f++;
        System.out.println(f);




}}
