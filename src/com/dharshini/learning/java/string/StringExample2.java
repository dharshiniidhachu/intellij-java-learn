package com.dharshini.learning.java.string;

public class StringExample2 {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("apple banana orange apple grape banana apple orange");
        String a  = sb.toString().replace("apple","strawberry");
        System.out.println("After replacing: " +a);

    }
}
