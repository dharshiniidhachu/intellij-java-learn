package com.dharshini.learning.java.thread;

class Threads extends Thread{
    public void run(){
        for(int i =1;i<5;i++){
            System.out.println("My Thread1: " + i);
            try{
                Thread.sleep(100);
            } catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
class Thread1 implements Runnable{
    public void run(){
        for (int i = 1;i<5;i++){
            System.out.println("My Thread2: " + i);
            try{
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class ThreadRunnableExample {
    public static void main(String[] args) {

        Threads myThread1 = new Threads();
        Thread myThread2 = new Thread(new Thread1());

        myThread1.start();
        myThread2.start();

    }
}
