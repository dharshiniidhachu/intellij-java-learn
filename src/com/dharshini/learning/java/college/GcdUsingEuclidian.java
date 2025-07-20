package com.dharshini.learning.java.college;

public class GcdUsingEuclidian {
    static int gcd(int a,int b) {
        if (a == 0)
            return b;  //morethan one line so optional for using braces

        if (b == 0)
            return a;

        if(a==b)
            return a;

        if (a > b)
            return gcd(a - b, b);
        return gcd(a, b - a); //if condition is false na ithu execute aagum

    }

    public static void main(String[] args) {
        System.out.println(gcd(20,28));
    }
}

