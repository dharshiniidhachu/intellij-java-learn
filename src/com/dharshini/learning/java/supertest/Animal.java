package com.dharshini.learning.java.supertest;

public class Animal {
    String name = "Animal";

    Animal() {
        System.out.println("Animal com.dharshini.learning.java.constructor called");
    }

    void display() {
        System.out.println("This is an Animal.");
    }
}

    class Dog extends Animal {
        String name = "com.dharshini.learning.java.classobjects.Dog";

        Dog() {
            super();
            System.out.println("com.dharshini.learning.java.classobjects.Dog com.dharshini.learning.java.constructor called.");
        }

        void display() {
            System.out.println("This is a com.dharshini.learning.java.classobjects.Dog");
        }

        void show() {
            super.display();
            System.out.println("Name in Animal: " + super.name);
            System.out.println("Name in com.dharshini.learning.java.classobjects.Dog: " + name);
        }

    }

