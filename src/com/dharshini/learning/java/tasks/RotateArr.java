package com.dharshini.learning.java.tasks;

import java.util.Scanner;

public class RotateArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int arr[] = new int[n];
        int[]arr2 = new int[n];
        for (int i =0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0;i< arr.length;i++){
            for(int j =1;j<i;j++){
            while(d!=0) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                d--;
                arr2 = new int[]{arr2[i]};
            }
            }
        }
        for(int i =0;i< arr2.length;i++) {
            System.out.println(arr2[i]);
        }
    }
}
