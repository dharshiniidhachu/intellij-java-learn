package com.dharshini.learning.java.datastructures;

import java.util.Arrays;

public class ArrayExample {

    public static void main(String[] args) {

        int arr[] = {1,2,34,5};

        Arrays.stream(arr).forEach(num -> System.out.print(num + " "));
    }
}
