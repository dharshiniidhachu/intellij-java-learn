package com.dharshini.learning.java.tasks;

import java.util.Arrays;
import java.util.Scanner;

public class LargestSmallestArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter elements: ");
        for (int i =0;i<size;i++) {
            arr[i]  = sc.nextInt();
        }
        System.out.println("Enter number to find smallest and largest: ");
        int num = sc.nextInt();
      //  Arrays.sort(arr);
        int temp =0;
        for(int i =0;i< arr.length-1;i++) {
            for(int j =0;j< arr.length-1-i;j++){
                temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
            }
        }
        if(num<=size){
            int smallest = arr[num - 1];
            int largest = arr[size - num];
            System.out.println(num + " Smallest: " + smallest);
            System.out.println(num + " largest: " + largest);
        }

    }
}
