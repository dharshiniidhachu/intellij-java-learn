package com.dharshini.learning.java.tasks;

public class Construct {
    static int length;
    static int breadth;
    Construct(){
        int l = length;
        int b = breadth;
    }
    Construct(int length,int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    static void calculate(int length,int breadth){
        System.out.println(length*breadth);
    }
    public static void main(String[] args) {
        Construct.calculate(2,3);
    }
}
