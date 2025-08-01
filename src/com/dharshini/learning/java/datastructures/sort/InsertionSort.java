package com.dharshini.learning.java.datastructures.sort;

public class InsertionSort {

    static int[] arr = {4,88,12,18,1};

    static void insertionSort(int[] arr) {
        int n = arr.length;
        for(int i = 1;i<n;i++) {
            int key = arr[i];
            int j = i - 1;
            while (j>=0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    static void printArray(int[] arr) {
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Original Array: ");
        printArray(arr);
        insertionSort(arr);
        System.out.println("Sorted Array: ");
        printArray(arr);
    }

}
