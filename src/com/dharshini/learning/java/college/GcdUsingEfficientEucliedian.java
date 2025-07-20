package com.dharshini.learning.java.college;

import java.util.Scanner;

public class GcdUsingEfficientEucliedian {
    static int gcd(int a,int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }
    public static void main(String[] args) {
        int result = gcd(20,28);
        System.out.println(result);

        }

    }

