package com.dharshini.learning.java.datastructures;

public class Minimum {

    public static void main(String[] args) {

        int[] arr = {12,13,18,20,3};
        int min = arr[0];
        for(int i =1;i< arr.length;i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
