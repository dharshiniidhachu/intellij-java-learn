package com.dharshini.learning.java.college;

public class MaximumProductOfValues {
    public static void main(String[] args) {
        int arr[] = {7,9,-3,8,-6,-7,8,10};
        int max = 0;
        int sum = 0;
        for (int i = 0;i< arr.length;i++){
            for (int j =i+1;j< arr.length;j++) {
                int product = arr[i] * arr[j];
                if (product > max) {
                    max = product;
                    sum = arr[i] + arr[j];
                }
            }
        }
        System.out.println(sum);

    }
}
