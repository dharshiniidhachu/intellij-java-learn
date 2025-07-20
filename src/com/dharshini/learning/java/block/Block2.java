package com.dharshini.learning.java.block;

public class Block2 {
        static int value;

        static {
            value = 10;
            System.out.println("Incrementing Static: " + value++);
        }

        public static void main(String[] args) {
            System.out.println("Value: " + ++value);
        }

}
