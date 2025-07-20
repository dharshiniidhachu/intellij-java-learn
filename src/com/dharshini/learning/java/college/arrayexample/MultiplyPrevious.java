package com.dharshini.learning.java.college.arrayexample;

import java.util.Scanner;

public class MultiplyPrevious {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0;i< arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1;i< arr.length;i++){
            arr[i] = arr[i-1] * arr[i];
        }
        for(int j : arr) {
            System.out.println(j);
        }

    }
}
