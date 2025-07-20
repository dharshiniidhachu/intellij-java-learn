package com.dharshini.learning.java.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {

    public static void main(String[] args) {

        Queue<String> a = new LinkedList<>();
        a.add("Dhachu");
        a.add("Shalu");
        a.add("Bueno");

        System.out.println("Head of the queue: " + a.peek());
        System.out.println("Removing element: " + a.poll());
        System.out.println("Remaining Elements in queue: " + a);
        System.out.println("Removing element: " + a.poll());
        System.out.println("Remaining Elements in queue: " + a);

    }
}
