package com.dharshini.learning.java.tasks;

import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i =0;i< arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        int maxCount =0;
        int freq = 0;
        for(int i =0;i< arr.length;i++){
            for (int j=1;j<i;j++) {
                if(arr[i]==arr[j]){
                    maxCount = arr[i];
                    freq++;
                }
            }
        }
        System.out.println("Most Frequent: " + maxCount);
        System.out.println("Frequency: " + freq);
    }
}
