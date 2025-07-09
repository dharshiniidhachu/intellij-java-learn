package com.dharshini.learning.java.wiproassessment.array;

import java.util.Scanner;

public class SumExclude6_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        int i =0;
        while (i< arr.length){
            if(arr[i]==6){
                i++;
                while (i< arr.length && arr[i] !=7){
                    i++;
                }
                i++;
            }
            else {
                sum = sum + arr[i];
                i++;
            }
        }
        System.out.println(sum);
    }
}
