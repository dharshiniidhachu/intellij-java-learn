package com.dharshini.learning.java.wiproassessment.array;

import java.util.Scanner;

public class SumAvg {
    public static void main(String[] args) {
       int arr[] = {10,20,30,40,50};
       int sum =0;
       for (int num : arr){
            sum = sum + num;
       }
       int avg = sum/ arr.length;
        System.out.println(sum);
        System.out.println(avg);
    }
}
