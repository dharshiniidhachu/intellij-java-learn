package com.dharshini.learning.java.college;

import java.util.Scanner;

public class GarmentsCompany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i =0;i< arr.length;i++) {
          arr[i] = sc.nextInt();
            }
        for (int i =0;i< arr.length;i++) {
            if(arr[i]==Math.sqrt(i)){
                System.out.println(arr[i]);
            }
        }
    }
}
