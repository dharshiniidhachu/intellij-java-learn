package com.dharshini.learning.java.thread;

class ThreadJoin extends Thread{

    public void run(){
        for(int i = 0;i<=6 ; i++){

            try{
                Thread.sleep(300);
                System.out.println("Current Thread name is " + currentThread().getName());
            } catch (Exception e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}

public class ThreadJoinExample {
    public static void main(String[] args) {

        ThreadJoin th1 = new ThreadJoin();
        ThreadJoin th2 = new ThreadJoin();
        ThreadJoin th3 = new ThreadJoin();
        th1.start();

        try{
            System.out.println("Current Thread name is " + Thread.currentThread().getName());
            th1.join();

        } catch (Exception e) {
            System.out.println(e);
        }

        th2.start();

        try{
            System.out.println("Current Thread name is " + Thread.currentThread().getName());
            th2.join();
        } catch (Exception e){
            System.out.println(e);
        }
        th3.start();
    }
}
