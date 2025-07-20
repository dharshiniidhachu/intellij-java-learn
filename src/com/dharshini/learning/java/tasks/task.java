package com.dharshini.learning.java.tasks;

import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number to print maxi: ");
        int num = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int countMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ++countMax;
                if (countMax == num) {
                    System.out.println(num + " Largest element is: " + max);
                    break;
                }
            }
        }
    }
}