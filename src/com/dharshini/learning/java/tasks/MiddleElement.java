package com.dharshini.learning.java.tasks;

import java.util.Scanner;

public class MiddleElement {
    public static int[] userInput(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void displayMid(int arr[]) {
        int length = arr.length;
        if(length==0){
            System.out.println("Empty Array");
        }
        if(length%2==0){
            int mid1 = length/2;
            int mid2 = length/2-1;
            System.out.println(arr[mid1]);
            System.out.println(arr[mid2]);
        }
        else {
            int mid = length / 2;
            System.out.println(arr[mid]);
        }
    }

    public static void main(String[] args){
       int[] arr = MiddleElement.userInput();
        MiddleElement.displayMid(arr);

    }
}
