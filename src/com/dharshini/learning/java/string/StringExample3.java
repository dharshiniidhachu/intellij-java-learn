package com.dharshini.learning.java.string;

public class StringExample3 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello Welcome to Java Programming");
        String word = sb.substring(6,21);
        System.out.println(word);
    }
}
