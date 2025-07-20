package com.dharshini.learning.java.college;

public class MagicNumber {

    public static boolean magic(int num) {

        while (num >= 10) {
            int total = 0;
            while (num > 0) {
                total = total + num % 10;
                num = num / 10;
            }
            num = total;
        }
        return num==1;

    }

    public static void main(String[] args) {
        System.out.println(MagicNumber.magic(19));
    }
}
