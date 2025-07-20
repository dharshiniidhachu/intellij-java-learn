package com.dharshini.learning.java.wrapperclass;

public class Example {
    public static void main(String[] args) {

        int a = 5, b = 10;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.max(a,b));
        System.out.println(Integer.min(a,b));
        int c = 12345;
        String s =  Integer.toString(c);
        System.out.println(s.charAt(0));

    }
}