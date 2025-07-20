package com.dharshini.learning.java.system;

public class ShutdownHookExample {

    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();

        runtime.addShutdownHook(new Thread(() -> {
            System.out.println("shutdown hook executed");
        }));

        System.out.println("Application running. Press Ctrl+C to exit");
    }
}
