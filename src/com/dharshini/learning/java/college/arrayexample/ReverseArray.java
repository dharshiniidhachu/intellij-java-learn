package com.dharshini.learning.java.college.arrayexample;

import java.util.Scanner;

public class ReverseArray {
    static void reverseArr(int[] arr) {
        int n = arr.length;
        for(int i =0;i<n/2;i++) {
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int[] arr = new int[size]; //storing the size in array
        System.out.println("Enter elements: ");  //elements getting i/p from user
        for (int i =0;i<size;i++) {
            arr[i] = sc.nextInt();
        }
        for(int num: arr) {
            System.out.println("Original array: " + num); //printing original array
        }
        //calling the reverse method to reverse the array..
        reverseArr(arr);
        for (int num : arr) {
            System.out.println("Reversed Array: " + num);
        }




    }
}
