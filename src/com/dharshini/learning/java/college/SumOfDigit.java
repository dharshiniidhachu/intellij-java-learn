package com.dharshini.learning.java.college;

public class SumOfDigit {

    public static void main(String[] args) {
        int n = 9875;
        int c=0;
        int d=0;
        while(n>0 || n>9){
            d=n%10;
            d=c+d;
            n=n/10;
        }
        System.out.println(d);
    }

}
