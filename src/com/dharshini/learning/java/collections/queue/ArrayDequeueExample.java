package com.dharshini.learning.java.collections.queue;

import java.util.ArrayDeque;

public class ArrayDequeueExample {

    public static void main(String[] args) {

        ArrayDeque<String> a = new ArrayDeque<>();
        a.addFirst("Dhachu");
        a.addLast("Shalu");
        a.addFirst("Bueno");

        System.out.println("Elements are: " + a);
        System.out.println("First Element: "  + a.peekFirst());
        System.out.println("Last Element: " + a.peekLast());

        a.removeFirst();
        a.removeLast();

        System.out.println("Elements: " +a);
        a.addFirst("Shriya");

        a.push("X");
        System.out.println("After pushed X into queue: " + a);
        System.out.println("Popped element: " + a.pop());

        System.out.println("Elements present are: " + a);
    }
}
