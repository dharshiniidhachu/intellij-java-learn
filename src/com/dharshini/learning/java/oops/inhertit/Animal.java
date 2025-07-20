package com.dharshini.learning.java.oops.inhertit;

class Animal {

    String name;

    public Animal(String name){

        this.name = name;
    }

    public void makeSound(){
        System.out.println(name + " makes a sound");
    }

    public void eat(){
        System.out.println(name + " eats food");
    }

}
