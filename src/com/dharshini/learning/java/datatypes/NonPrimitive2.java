package com.dharshini.learning.java.datatypes;

import java.util.ArrayList;

public class NonPrimitive2 {
    public static void main(String[] args) {
        String name = "Dharshini Sivakumar";
        System.out.println("String value: " + name.length());
        System.out.println("value at index 3 :" + name.charAt(3));

        ArrayList<String> Person = new ArrayList(0);
        Person.add("Dhachu");
        Person.add("Shalu");
        Person.add("Nandhu");
        System.out.println("Index 1:" + Person.get(0));
        System.out.println("Size :" + Person.size());
    }
}
