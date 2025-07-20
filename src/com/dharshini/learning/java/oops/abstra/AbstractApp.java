package com.dharshini.learning.java.oops.abstra;

abstract class Animal {

    abstract void makeSound();

    void eat(){
        System.out.println("This animal eats food");
    }
}

class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Woof woof");
    }
}

public class AbstractApp {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.makeSound();
        dog.eat();

    }
}
