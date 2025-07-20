package com.dharshini.learning.java.college;

public class Digit {
    public static void main(String[] args) {
        int num = 12345;
        int ld= num % 10;

        while(num >= 100) {
            num = num/10;
        }
        System.out.println("second Digit: " + num%10);
    }
}
