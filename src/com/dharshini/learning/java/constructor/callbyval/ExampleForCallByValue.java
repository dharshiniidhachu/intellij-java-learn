package com.dharshini.learning.java.constructor.callbyval;

public class ExampleForCallByValue {
    public static void modifyValue(int a) {
        a = 10;
        System.out.println("A Value in modifyvalue method : " + a);
    }

    public static void main(String[] args) {
        int a = 5;
        modifyValue(a);
        System.out.println("A Value in main method : " + a);
    }
}
