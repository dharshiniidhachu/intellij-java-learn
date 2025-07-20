package com.dharshini.learning.java.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {

    private final int taskId;

    public Task(int taskId) {
        this.taskId = taskId;
    }

    public void run(){
        System.out.println("Task " + taskId + " is running on thread " + Thread.currentThread().getName());

        try{
            Thread.sleep(5000);

        } catch (InterruptedException e){
            e.printStackTrace();
        }
    System.out.println("Task " + taskId + "is running on thread " + Thread.currentThread().getName());

}
}

public class ThreadPoolExecutor {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(8);

        for(int i = 1;i<=20;i++) {
            Thread.sleep(500);
            executor.submit(new Task(i));
        }

        executor.shutdown();

        System.out.println("All tasks submitted");

    }
}
