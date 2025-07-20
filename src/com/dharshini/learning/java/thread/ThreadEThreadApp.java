package com.dharshini.learning.java.thread;

class MyThread extends Thread{

    public void run(){
        System.out.println("Thread is running..");
    }
}

public class ThreadEThreadApp {

    public static void main(String[] args) {

        MyThread thread1 = new MyThread();
        thread1.start();
    }
}
