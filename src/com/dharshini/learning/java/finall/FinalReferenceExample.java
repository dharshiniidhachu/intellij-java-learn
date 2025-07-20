package com.dharshini.learning.java.finall;

class FinalReferenceExample {
    public static void main(String[] args) {

        final StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb);
        
        //sb = new StringBuilder("New object");
    }
}
