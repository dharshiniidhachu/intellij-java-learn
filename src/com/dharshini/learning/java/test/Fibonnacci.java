package com.dharshini.learning.java.test;

public class Fibonnacci {

    public static void main(String[] args) {
        int first=0;
        int second=1;

        for(int i=0;i<11;i++){
            int next = first + second;
            System.out.println(first);
            first = second;
            second = next;
        }
    }
}
