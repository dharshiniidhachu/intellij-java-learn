package com.dharshini.learning.java.wiproassessment.array;

import java.util.Scanner;

public class SorttArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Elements: ");
        for (int i =0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for (int i=0;i<n-1;i++){
            for (int j =0;j<n-1-i;j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Array using Bubble sort: ");

        for (int i =0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }

    }
}
