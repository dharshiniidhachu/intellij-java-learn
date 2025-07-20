package com.dharshini.learning.java.college;

public class TrailingZeros {
    public static void main(String[] args) {
        int n =200;
        int count =0;
        for(int i =5;n/i>=1;i=i*5) {
            count = count +n/i;
        }
        System.out.println(count);

    }
}
