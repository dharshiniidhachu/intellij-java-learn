package com.dharshini.learning.java.college;

public class SumEven {
    public static void main(String[] args) {

        int n = 200;

        int sum = 0;

        for(int i=1;i<n;i++) {

            if(i%2==0 && (i%10)!=0 ) {

                sum = sum +i;

            }
        }
        System.out.println(sum);
    }
}
