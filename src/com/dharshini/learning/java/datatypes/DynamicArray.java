package com.dharshini.learning.java.datatypes;

import java.util.ArrayList;

public class DynamicArray {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Dhachu");
        list.add("Shalu");
        list.add("Dhachu");
        list.add("Shalu");
        list.add("Dhachu");
        list.add("Shalu");

        System.out.println("First element : " +list.get(0));
        System.out.println("Last element : " +list.lastIndexOf("Dhachu"));
    }
}
