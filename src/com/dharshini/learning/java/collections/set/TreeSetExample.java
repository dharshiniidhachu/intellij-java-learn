package com.dharshini.learning.java.collections.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        TreeSet<String> names = new TreeSet<>();
        names.add("Emma");
        names.add("Olivia");
        names.add("Sophia");
        names.add("Emma");

        System.out.println("Names (Sorted Order): " +names);

        names.add("Ava");
        System.out.println("After adding Ava: " + names);

        System.out.println("First Element: " +names.first());
        System.out.println("Last Element: " + names.last());

        System.out.println("Iterating over set:");
        Iterator<String> i = names.iterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
