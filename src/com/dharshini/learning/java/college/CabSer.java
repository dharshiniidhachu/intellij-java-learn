package com.dharshini.learning.java.college;

import java.util.Scanner;

public class CabSer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int start = sc.nextInt();
        int end = sc.nextInt();
        int arr[] = new int[size];

        for (int i=0;i< arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        for (int i =0;i< arr.length;i++) {
            if(arr[i]>=start && arr[i] <=end) {
                System.out.println(arr[i]);
            }
        }
    }
}
