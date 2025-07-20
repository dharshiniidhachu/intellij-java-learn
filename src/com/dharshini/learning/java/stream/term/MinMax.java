package com.dharshini.learning.java.stream.term;

import java.util.Arrays;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(12,2,34,56);

        int min = num.stream().min(Integer::compareTo).get();
        int max = num.stream().max(Integer::compareTo).get();

        System.out.println("Min:" + min + " Max:" + max);
    }
}
