package com.dharshini.learning.java.leetcode;


public class MergeStrings {

public static String mergeStrings(String word1, String word2) {

    StringBuffer sb = new StringBuffer();
    int i=0,j=0;

    while(i < word1.length() || j < word2.length()){
        if(i<word1.length()){
            sb.append(word1.charAt(i));
            i++;
        }
        if(j<word2.length()){
            sb.append(word2.charAt(j));
            j++;
        }
    }
    return sb.toString();

}

    public static void main(String[] args) {

        System.out.println(mergeStrings("abc","pqrs"));
        System.out.println(mergeStrings("abcdef","pq"));

    }
}
