package com.dharshini.learning.java.datatypes;

public class SumofArray {

    public static void main(String[] args) {

        int arr[] = {12,43,23,12};
        int sum =0;

        for (int i : arr)
            sum = sum + i;

        System.out.println(sum);

    }
}
