package com.dharshini.learning.java.collections.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> name = new HashSet<>();
        name.add("Dhachu");
        name.add("Shalu");
        name.add("Gowtham");

        System.out.println("Names added using hash set: " + name);

        boolean b = name.contains("Dhachu");
        System.out.println(b);

        name.add("Bueno");
        name.add("Nandhu");

        System.out.println("After adding names: " + name);

        name.remove("Dhachu");
        System.out.println("After removing : " + name);

        Set<Integer> a = new HashSet<>();
        a.addAll(Arrays.asList(12,18,6,10));

        Set<Integer> a1 = new HashSet<>();
        a1.addAll(Arrays.asList(3,12,1,8));

        Set<Integer> union = new HashSet<>(a);
        union.addAll(a1);
        System.out.println("Union of two sets: " +union);

        Set<Integer> intersection = new HashSet<>(a);
        intersection.retainAll(a1);
        System.out.println("Intersection of two sets: " +intersection);

        Set<Integer> difference = new HashSet<>(a);
        difference.removeAll(a1);
        System.out.println("Difference between two sets: " + difference);


        Iterator<String> iter = name.iterator();
        System.out.println("Iterating HashSet: ");

        while(iter.hasNext()){
            System.out.println(iter.next());
        }

    }
}
