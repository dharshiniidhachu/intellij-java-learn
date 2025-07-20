package com.dharshini.learning.java.system;

public class RuntimeExample {

    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();

        System.out.println("Available processors: " + runtime.availableProcessors());
        System.out.println("Free Memory: " + runtime.freeMemory() + " bytes");
        System.out.println("Total memory: " + runtime.totalMemory() + " bytes");
        System.out.println("Max memory: " + runtime.maxMemory() + " bytes");
    }
}
