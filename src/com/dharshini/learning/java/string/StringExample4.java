package com.dharshini.learning.java.string;

public class StringExample4 {
    public static void main(String[] args) {
        StringBuffer word1 = new StringBuffer("California");
        StringBuffer word2 = new StringBuffer("Connecticut");
        StringBuffer word3 = new StringBuffer("Newjersy");
        StringBuffer word4 = new StringBuffer("Maryland");
        boolean b = word1.indexOf("California",0) == word2.indexOf("Connecticut",0);
        boolean b1 = word1.indexOf("Connecticut",0) == word3.indexOf("Newjersy",0);
        boolean b2 = word3.indexOf("Newjersy",00) == word4.indexOf("Maryland",0);
        System.out.println(b);
        System.out.println(b1);
        System.out.println(b2);

    }
}
