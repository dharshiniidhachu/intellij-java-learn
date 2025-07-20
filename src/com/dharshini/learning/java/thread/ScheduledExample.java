package com.dharshini.learning.java.thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class ScheduledTask implements Runnable{

    @Override
    public void run() {
        System.out.println("Executing At: " +System.currentTimeMillis()+ " on thread " + Thread.currentThread().getName());
    }
}

public class ScheduledExample {

    public static void main(String[] args) {

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);
        scheduler.scheduleAtFixedRate(new ScheduledTask(),1,2, TimeUnit.SECONDS);
        scheduler.scheduleWithFixedDelay(new ScheduledTask(),2,3,TimeUnit.SECONDS);
        Executors.newSingleThreadScheduledExecutor().schedule(() -> scheduler.shutdown(),20,TimeUnit.SECONDS);

    }
}
