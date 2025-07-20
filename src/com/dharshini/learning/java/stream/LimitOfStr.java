package com.dharshini.learning.java.stream;

import java.util.stream.Stream;

public class LimitOfStr {
    public static void main(String[] args) {

        Stream.of(1,2,3,4,5)
                .limit(3).
                forEach(System.out::println);

        System.out.println("SKIP 2 ELEMENTS");

        Stream.of(1,2,3,4,5)
                .skip(2)
                .forEach(System.out::println);
    }
}
