package com.dharshini.learning.java.collections.list;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIterateAtSpecificPosition {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(12);
        list.add(18);
        list.add(20);
        list.add(40);

        ListIterator<Integer> a =list.listIterator(2);

        while(a.hasNext()){
            System.out.println(a.next());
        }

    }
}
