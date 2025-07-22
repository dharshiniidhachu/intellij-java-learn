package com.dharshini.learning.java.seminar;

import java.util.LinkedHashMap;
import java.util.Map;

public class Practice_LinkedHash {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> m = new LinkedHashMap<>();

        m.put(3,"Z");
        m.put(1,"A");
        m.put(2,"B");

        System.out.println(m);
    }
}
