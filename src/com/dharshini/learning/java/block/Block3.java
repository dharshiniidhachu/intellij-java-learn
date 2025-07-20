package com.dharshini.learning.java.block;

public class Block3 {
        private int number;

        {
            number = 12;
            System.out.println("Non-static block Incrementing: " + ++number);
        }

        public static void main(String[] args) {

            Block3 obj = new Block3();
        }
}
