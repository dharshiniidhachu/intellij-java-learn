package com.dharshini.learning.java.tasks;

import java.util.Scanner;

public class ThirdLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i< arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        for (int i =0;i< arr.length;i++) {
            if(arr[i]>firstMax){
                firstMax = arr[i];
            }
        }
        for (int i =0;i< arr.length;i++) {
            if(arr[i]>secondMax && arr[i]<firstMax){
                secondMax = arr[i];
            }
        }
        for (int i =0;i< arr.length;i++) {
            if(arr[i]>thirdMax && arr[i]<secondMax) {
            thirdMax = arr[i];
            }
        }
        System.out.println(thirdMax);
    }
}
