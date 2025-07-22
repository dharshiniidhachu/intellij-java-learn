package com.dharshini.learning.java.seminar;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHash_Cons {
    public static void main(String[] args) {
        Map<Integer,String> m = new LinkedHashMap<>(5,0.75f,true);
        m.put(1,"A");
        m.put(2,"b");
        m.put(3,"c");

        m.get(1);  //accessed moved to end

        System.out.println(m);
    }
}
