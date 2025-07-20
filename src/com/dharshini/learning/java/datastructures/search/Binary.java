package com.dharshini.learning.java.datastructures.search;

public class Binary {

    public static int binarySearch(int arr[],int target) {

        int left = 0,right = arr.length-1;
        while (left<=right) {

            int mid = left + (right-left)/2;

            if(arr[mid] == target){
                return mid;
            }
            if (arr[mid]>target) {
                right = mid - 1;

            }else {
                left = mid + 1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[] = {4,16,28,35};
        int target = 28;
        int result = binarySearch(arr,target);
        System.out.println("Element found at index: " + result);
    }
}
