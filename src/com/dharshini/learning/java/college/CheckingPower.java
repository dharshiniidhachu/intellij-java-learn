package com.dharshini.learning.java.college;

public class CheckingPower {
    public static void main(String[] args) {
        System.out.println(CheckingPower.power(2,3));

    }
    public  static int power(int a,int b) {
        int c=1;
       // for(int i=0;i<a;i++) {
        //     c = c*b;
       // }

        //return c;

        while(b>0) {
            c = c*a;
            b--;
        }
        return c;

    }
}
