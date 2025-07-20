package com.dharshini.learning.java.collections.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueWithJoin {
    public static void main(String[] args) {

        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(6);

        Thread producer = new Thread(() -> {
            try{
                for(int i =1;i<=10;i++){
                    System.out.println(i);
                    queue.put(i);
                    Thread.sleep(100);
                }
                queue.put(-1); //stop signal
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread consumer = new Thread(() -> {
            try{
                while(true){
                    Integer item = queue.take();
                    if (item == -1) { //breaks the loop when ir reaches stop
                        break;
                    }

                    System.out.println("Consuming thread: " + item);
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();

        try{
            producer.join();  //main thread waits for the producer to complete
            consumer.join();   // main thread waits for the consumer to complete
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Program terminated successsfully");

    }

}
