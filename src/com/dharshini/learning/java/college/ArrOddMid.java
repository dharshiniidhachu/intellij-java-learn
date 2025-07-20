package com.dharshini.learning.java.college;

import java.util.Arrays;
import java.util.Scanner;

public class ArrOddMid {
    public static int[] constructArr(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i =0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        return constructArr();
    }
    static int displayMiddle(){
        for (int i =0;i< constructArr().length;i++) {
            for (int j= 0;j<constructArr().length-1-i;j++) {
                int temp = constructArr()[i];
                constructArr()[i] = constructArr()[j];
                constructArr()[j] = temp;
            }
        }
        int n = constructArr().length;
        if(n%2!=0) {
            return n / 2;
        }
        return -1;

    }

    public static void main(String[] args) {
        ArrOddMid.constructArr();
        ArrOddMid.displayMiddle();
    }
}
