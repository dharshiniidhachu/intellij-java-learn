package com.dharshini.learning.java.test;

public class test2 {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        long halfMemory = runtime.totalMemory()/2;

        System.out.println(totalMemory);
        System.out.println(halfMemory);

    }
}
