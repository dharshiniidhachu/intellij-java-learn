package com.dharshini.learning.java.datastructures;

public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = {100,67,89,45,12,14};
        int fisrt = 0;
        int last = arr.length-1;
        int temp = 0;

        while(fisrt<last)
        {
            temp = arr[fisrt];
            arr[fisrt] = arr[last];
            arr[last] = temp;

            fisrt++;
            last--;
        }
        for(int num: arr){
        System.out.println(num);
    }

}}
