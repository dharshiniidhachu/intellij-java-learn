package com.dharshini.learning.java.block;

public class StaticBlock {
    static int count;

    static {
        System.out.println("Static com.dharshini.learning.java.block.Block Executed");
        count = 10;
    }

    public static void main(String[] args) {
        System.out.println("Main method executed");
        System.out.println("Static count : " +count);



    }
}
