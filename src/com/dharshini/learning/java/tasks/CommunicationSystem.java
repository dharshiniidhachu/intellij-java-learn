package com.dharshini.learning.java.tasks;

import java.util.Scanner;

public class CommunicationSystem {

    void sumPairs() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of devices: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter signal values: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the security code: ");
        int s = sc.nextInt();
        for (int i=0;i< arr.length;i++){
            for (int j=0;j< arr.length;j++) {
                if(arr[i]+arr[j]==s) {
                    System.out.println(arr[i]+","+arr[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        CommunicationSystem a = new CommunicationSystem();
        a.sumPairs();

    }
}
