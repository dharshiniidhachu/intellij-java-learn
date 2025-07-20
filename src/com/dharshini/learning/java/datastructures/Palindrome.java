package com.dharshini.learning.java.datastructures;

public class Palindrome {
    public static void main(String[] args) {

        int[] arr = {1, 4, 5, 4, 1};
        int first = 0;
        int last = arr.length-1;

        for(int i =0;i< arr.length;i++) {
            if(first==last) {
                first++;
                last--;
            }
            System.out.println(arr[i]);
    }
}}