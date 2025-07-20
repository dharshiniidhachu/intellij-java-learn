package com.dharshini.learning.java.college.arrayexample;

import java.util.Scanner;

public class ReverseArrayTwoPointer {
    static void reverseArr(int[] arr) {
        int left = 0; int right = arr.length-1;
        while (left<right) {
            int temp = left;
            left = right;
            right = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {20,70,60,80,90};
        reverseArr(arr);
        for(int i =0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
