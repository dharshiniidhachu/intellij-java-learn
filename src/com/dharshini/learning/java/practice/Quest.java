package com.dharshini.learning.java.practice;

public class Quest {
    public static void main(String[] args) {
        String s = "aabcc";

        for (int i = 0; i < s.length(); i++) {

            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {

                System.out.println("First non-repeating: " + s.charAt(i));

                break;

            }

        }

    }
}