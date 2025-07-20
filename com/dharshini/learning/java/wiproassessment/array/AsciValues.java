package com.dharshini.learning.java.wiproassessment.array;

import java.util.Scanner;

public class AsciValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements: ");
        for (int i =0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Ascii values are: ");
        for (int i =0;i< arr.length;i++){
            System.out.print((char) arr[i]);
        }

    }
}
