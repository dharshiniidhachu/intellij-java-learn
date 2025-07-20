package com.dharshini.learning.java.college;

public class Var{

    static int a = 10;

    int b = 20;

    public void d(){
        b=7;
    }

    public static void main(String[] args) {

        int c = 30;

        System.out.println("Local variable is equal to " + c);

        System.out.println(" Static variable " + a);

            Var obj = new Var();
            obj.d();

        System.out.println("Instance variable is " + obj.b);

    }
}
