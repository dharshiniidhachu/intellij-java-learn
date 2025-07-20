package com.dharshini.learning.java.tasks;

import java.util.Scanner;

public class MaxSum {

    public int[] getUser(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =new int[n];
        for (int i =0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public void display(int[] arr){
        int l = arr.length;
        int max =0;
        for (int i=0;i< l;i++) {
            for (int j=1;j<l;j++){
                int sum = arr[i] + arr[j];
                if(sum>max) {
                    max = sum;
                }
            }
        }
        System.out.println(max);
    }


    public static void main(String[] args) {
        MaxSum m = new MaxSum();
        int[] arr = m.getUser();
        m.display(arr);

    }
}
