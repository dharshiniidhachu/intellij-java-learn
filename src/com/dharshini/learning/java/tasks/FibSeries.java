package com.dharshini.learning.java.tasks;

public class FibSeries {

    public static int[] genSeq(int n) {
        if (n <= 0) {
            int i = 0;
            return new int[]{i};
        }
        int[] seq = new int[n];
        seq[0] = 0;
        if (n == 1)
            return seq;
        seq[1] = 1;

        for (int i = 2; i < n; i++) {
            seq[i] = seq[i - 1] + seq[i - 2];
        }

        return seq;
    }

    public static void main(String[] args) {
        int[] sequence = genSeq(5);

        for (int num : sequence) {
            System.out.print(num + " ");
        }
    }
}