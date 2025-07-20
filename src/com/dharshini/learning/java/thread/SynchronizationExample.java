package com.dharshini.learning.java.thread;


class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }

}

class MySyncThread extends Thread {
    private Counter counter;

    public MySyncThread(Counter counter) {
        this.counter = counter;
    }

    public void run(){
        for(int i=0;i<1000;i++){
            counter.increment();
        }
    }
}


public class SynchronizationExample {

    public static void main(String[] args) throws InterruptedException{

        Counter counter = new Counter();
        MySyncThread t1 = new MySyncThread(counter);
        MySyncThread t2 = new MySyncThread(counter);

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(counter.getCount());
    }


}
