package com.dharshini.learning.java.collections.list;

import java.util.LinkedList;

public class LinkedListIterate {
    public static void main(String[] args) {
        LinkedList<String> a = new LinkedList<>();
        a.add("Dhachu");
        a.add("Shalu");
        a.add("Gowtham");
        a.add("Nandhini");
        a.add("Buenno");
        System.out.println("Iterating through for loop in linkedlist: ");
        for(String list : a){
            System.out.println(list);
        }


    }
}
