package com.dharshini.learning.java.collections.list;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("John");
        names.add("Emma");
        names.add("Sophia");

        System.out.println("Names: " +names);

        names.addFirst(("Alice"));
        System.out.println("After adding first: " +names);

        names.removeLast();
        System.out.println("After removing last: " +names);
    }
}
