package com.dharshini.learning.java.wiproassessment.Polymorphism;

public class Fruit {
    String name;
    String taste;
    int size;

    public Fruit(String name, String taste, int size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    void eat(){
        System.out.println(name);
        System.out.println(taste);
        System.out.println(size);
    }
}
