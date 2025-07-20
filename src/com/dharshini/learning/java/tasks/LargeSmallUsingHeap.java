package com.dharshini.learning.java.tasks;

import java.util.PriorityQueue;
import java.util.Scanner;

public class LargeSmallUsingHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> min = new PriorityQueue<>();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int n = sc.nextInt();
        int num = sc.nextInt();
        for (int i =0;i<size;i++) {
            min.add(num);
        }
            if(size>n) {
                min.poll();
            }
        System.out.println(min);
    }
}
