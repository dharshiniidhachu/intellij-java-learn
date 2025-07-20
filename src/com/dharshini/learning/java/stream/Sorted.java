package com.dharshini.learning.java.stream;

import java.util.Arrays;
import java.util.List;

public class Sorted {
        public static void main(String[] args) {
                List<String> names = Arrays.asList("Charlie","Bob","Alice");
                names.stream()
                        .sorted()
                        .forEach(System.out::println);
                System.out.println("Sort in Reverse order");
                names.stream()
                        .sorted((Alice,Bob)->Bob.compareTo(Alice))
                        .forEach(System.out::println);
        }
}