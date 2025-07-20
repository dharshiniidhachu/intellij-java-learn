package com.dharshini.learning.java.datastructures.sort;

public class Bubble {
    static void bubblesort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for(int i=0;i<n-1;i++) {
            swapped = false;

            for(int j=0;j<n-1-i;j++)
            {
                if (arr[j] > arr[j+1])
                {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;

                swapped= true;
            }
            }
        }

    }
    static void printArray(int[] arr) {
        for(int num : arr) {
            System.out.print( num + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] arr = {32,18,2,6,40};
        bubblesort(arr);
        printArray(arr);
    }
}
