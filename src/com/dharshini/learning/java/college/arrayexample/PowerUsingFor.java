package com.dharshini.learning.java.college.arrayexample;

public class PowerUsingFor {
    public static void main(String[] args) {
        int base = 2;
        int exp = 3;
        int result = 1;
        for(int i=1;i<=exp;i++) {
            result = result * base;
        }
        System.out.println(result);
    }
}
