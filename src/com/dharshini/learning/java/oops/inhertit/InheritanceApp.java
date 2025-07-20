package com.dharshini.learning.java.oops.inhertit;

public class InheritanceApp {
    public static void main(String[] args) {
        Animal animal = new Animal("GenericAnimal");
        animal.makeSound();
        animal.eat();

        Dog dog = new Dog("Bueno");
        dog.makeSound();
        dog.eat();
        dog.fetch();

        Cat cat = new Cat("Tuno");
        cat.makeSound();
        cat.eat();
        cat.doCatch();
    }
}
