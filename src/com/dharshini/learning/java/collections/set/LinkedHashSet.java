package com.dharshini.learning.java.collections.set;

import java.util.Iterator;

public class LinkedHashSet {

    public static void main(String[] args) {

        java.util.LinkedHashSet<Integer> numbers = new java.util.LinkedHashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20);

        System.out.println("Numbers (on insertion order): " +numbers);

        numbers.add(40);
        System.out.println("After Adding 40: " + numbers);

        System.out.println("Iterating over set");
        Iterator<Integer> i = numbers.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
