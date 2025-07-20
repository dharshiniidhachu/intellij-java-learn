package com.dharshini.learning.java.test;

import java.util.ArrayList;

import static java.lang.Runtime.getRuntime;

public class Test1 {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        long totalMemory = getRuntime().totalMemory();
        long freeMemory = getRuntime().totalMemory();
        long halfMemory = getRuntime().totalMemory()/2;

        System.out.println("Total memory: " + totalMemory);
        System.out.println("Free memory: " + freeMemory);
        System.out.println("Half memory: " + halfMemory);

        ArrayList<Object> a = new ArrayList<>();
        for(int i = 0;i<200001;i++)
        {
            a.add(new Object(i,"Name"+i, "PhoneNo"+i,"Address"+i));
        }

        long memoryAfterObjectCreation = Runtime.getRuntime().freeMemory();
        System.out.println("Memory used by user objects:" + memoryAfterObjectCreation);

    }
}
