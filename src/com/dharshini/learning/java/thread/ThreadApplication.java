package com.dharshini.learning.java.thread;

class MyThreads extends Thread{
    public void run(){
        System.out.println("Thread " + currentThread().getId() + " is running");
    }
}

public class ThreadApplication {

    public static void main(String[] args) {

        for(int i=0;i<=5;i++){
            new MyThreads().start();
        }
    }

}
