package com.dharshini.learning.java.wiproassessment.array;

import java.util.Scanner;

public class Remove_Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for (int i =0;i< arr.length;i++){
            int count =0;
            for (int j =0;j<i;j++){
                if(arr[i]==arr[j]){
                    count= 1;
                    break;
                }
            }
            if(count==0){
                System.out.print(arr[i] + " ");
            }
        }

    }
}
