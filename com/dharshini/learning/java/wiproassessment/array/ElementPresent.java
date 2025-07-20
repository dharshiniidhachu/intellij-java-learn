package com.dharshini.learning.java.wiproassessment.array;

import java.util.Scanner;

public class ElementPresent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements: ");
        for (int i =0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter search element: ");
        int search = sc.nextInt();
        int i;

        for (i =0;i< arr.length;i++){
           if(arr[i]==search){
               System.out.println(3);
               break;
           }
        }
        if(i==arr.length){
            System.out.println(-1);
        }
    }
}
