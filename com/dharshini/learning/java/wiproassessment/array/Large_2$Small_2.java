package com.dharshini.learning.java.wiproassessment.array;

import java.util.Scanner;

public class Large_2$Small_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i =0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int i =0;i< arr.length;i++){
            if(arr[i]>max){
                max2 = max;
                max = arr[i];
            } else if (arr[i]>max) {
                max2 = arr[i];
            }
            if(arr[i]<min){
                min2 = min;
                min = arr[i];
            } else if (arr[i]<min2) {
                min2 = arr[i];

            }
            //if used sort method in array means for large elements use (n-1) and (n-2)
            //for small elements use arr[0] and arr[1]

        }
        System.out.println("Largest 2 numbers " + max +" and " + max2);
        System.out.println("Smallest 2 numbers " + min +" and " + min2);
    }
}
