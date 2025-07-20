package com.dharshini.learning.java.typeconversion;

public class TypeConversion {

    public static void main(String[] args) {

        //IMPLICIT-NO DATA LOSS
        byte b = 127;
        int a =  b;
        System.out.println(a);

        //EXPLICIT-DATA LOSS
        float f = 20.3f;
        int n = (int) f;
        System.out.println(n);

        long l = 56789l;
        byte t = (byte) l;    //EXPLICIT
        int t1 = (int) l;     //EXPLICIT
        short t2 = (short) l; //EXPLICIT
        float t3 = l;         //IMPLICIT
        System.out.println(t);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

    }
}
