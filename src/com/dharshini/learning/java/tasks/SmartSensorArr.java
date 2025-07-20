package com.dharshini.learning.java.tasks;

import java.util.Scanner;

public class SmartSensorArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter 1 or 2: ");
        int option = sc.nextInt();
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            int count =0;
            if(i>=2) {
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        count++;
                        break;
                    }
                }
            }else {
                count++;
            }
            if(count>0 && option==2){
                    sum = sum +arr[i];
                }
                if(count==0&& option==1) {
                    sum = sum + arr[i];
                }
            }
        System.out.println(sum);
    }
}
