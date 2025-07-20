package com.dharshini.learning.java.college;

public class TypeCasting {
    public static void main(String[] args) {
        byte b = 6;
        short a = b;
        int c = a;
        float d = c;
        double e = d;

        System.out.println("Byte to short" + a);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        double f = 32.8745;
        float g = (float) f;
        long l = (long) g;
        int t =(int) l;
        System.out.println(g);
        System.out.println(l);
        System.out.println(t);



    }
}
