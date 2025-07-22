package com.dharshini.learning.java.tasks;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Eter elements of array: ");

        for (int i = 0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter no.of.times to rotate array: ");
        int d = sc.nextInt();
        if(d<0){
            d = d+arr.length;
        }
        else {
            d = d% arr.length;
        }
        for(int i =0;i<d;i++) {
            int temp = arr[0];
            for (int j = 1; j < arr.length; j++) {
                arr[j - 1] = arr[j];  //moving elements if positive means move left(anti-clockwise) and if d is negative means move right(clockwise)
            }
            arr[arr.length-1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
