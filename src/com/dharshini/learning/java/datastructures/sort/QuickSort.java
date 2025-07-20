package com.dharshini.learning.java.datastructures.sort;

public class QuickSort {

    static int[] arr = {12,9,18,6,20,2};
    static void quickSort(int[] arr,int low,int high) {
        if(low<high) {
            int pivotIdx = partition(arr,low,high);
            quickSort(arr,low,pivotIdx-1);
            quickSort(arr,pivotIdx+1,high);
        }
    }
    static int partition(int[] arr,int low, int high) {

        int pivot = arr[high];
        int i = low -1;

        for(int j = low;j<high;j++) {
            if(arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    static void printArray(int[] arr) {
        for (int num:arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Original Array: ");
        printArray(arr);
        quickSort(arr,0,arr.length-1);
        System.out.println("sorted array: ");
        printArray(arr);
    }
}

