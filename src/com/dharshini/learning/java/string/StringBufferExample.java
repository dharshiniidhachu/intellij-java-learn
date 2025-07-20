package com.dharshini.learning.java.string;

public class StringBufferExample
{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println("After append: " + sb);
        sb.insert(6,"Beautiful ");
        System.out.println("After Insert: " + sb);
        sb.replace(6,15, "Amazing");
        System.out.println("After replace: " + sb);
        sb.delete(6, 13);
        System.out.println("After delete: " + sb);
        sb.reverse();
        System.out.println("After reverse: " +sb);
        System.out.println("capacity :" + sb.capacity());
    }
}
