package com.dharshini.learning.java.collections.queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(12);
        pq.add(10);
        pq.add(18);
        pq.add(2);

        System.out.println("Priority queue: " + pq);
        System.out.println("Peek: " + pq.peek());

        while(pq!=null){
            System.out.println(pq.poll());
        }
    }
}
