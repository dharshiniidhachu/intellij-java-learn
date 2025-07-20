package com.dharshini.learning.java.stream;

import java.util.Arrays;
import java.util.List;

public class MapEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice","Bob","Charlie");
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
