package com.dharshini.learning.java.datatypes;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int arr[] = {10, 75, 22, 12, 01};
        System.out.println("Original array: " +Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted array: " +Arrays.toString(arr));
    }
}