package com.dharshini.learning.java.test;

public class CallByValue {
    public static void modify(int num)
    {
        System.out.println("Before modifying, num = " + num);
        num = num + 10;
        System.out.println("After modifying, num = " + num);
    }

    public static void main(String[] args) {
        int num2 = 50;
        System.out.println("original value before modify: " + num2);
        modify(num2);
        System.out.println("Original value after modify: " + num2);
    }
}

