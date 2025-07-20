package com.dharshini.learning.java.datastructures;

public class EvenIntegers {

    public static void main(String[] args) {

        int[] arr = {2,9,4,6,5,3,1,12,20,77};
        for(int num : arr){
            if(num%2 !=0){
                System.out.println(num);
            }
        }
    }
}
