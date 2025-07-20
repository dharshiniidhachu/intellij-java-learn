package com.dharshini.learning.java.tasks;

import java.util.Scanner;

public class OccurrenceOfArrEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i =0;i<size;i++) {
            arr[i] = sc.nextInt();
        }
        for (int i =0;i< arr.length;i++){
            int count =0;
            for (int j =0;j<arr.length;j++) {
                if(arr[i]==arr[j]) {
                    count++;
                    break;
                }
            }
            System.out.println(arr[i] + "-" + count + "Occurences");

        }
    }
}
