package com.dharshini.learning.java.college;

import java.util.Scanner;

public class CountDigit {
    public static int ctDigit(int n) {

        // return (int)Math.floor(Math.log(n)+1);
        // --> counting digits without loop Used casting and Used Floor to round off the value

        //Another method is By converting int or long to string and Get its length
        //String s = Integer.toString(n);
        //return s.length();

        if(n==0) {
            return 1;
        }
        int count =0;
        while(n!=0) {
            n = n/10;
            count++; //or ++count both do same operation here
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //compile time
        int n = -4557;
        System.out.println(ctDigit(n));
        //runtime user input
        int num = sc.nextInt();
        int result = ctDigit(num);
        System.out.println(result);
    }
}
