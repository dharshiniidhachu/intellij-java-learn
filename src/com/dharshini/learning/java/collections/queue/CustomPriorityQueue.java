package com.dharshini.learning.java.collections.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class CustomPriorityQueue {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(30);
        pq.add(100);
        pq.add(13);
        pq.add(87);
        pq.add(31);

        while(!pq.isEmpty()){
            System.out.println("Poll: " + pq.poll());
        }
    }
}
