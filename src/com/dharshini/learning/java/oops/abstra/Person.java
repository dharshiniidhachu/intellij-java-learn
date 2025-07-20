package com.dharshini.learning.java.oops.abstra;

abstract class Person {

    abstract void eat();

    abstract void exercise();

}

 class Athelete extends Person{

    public void eat(){
        System.out.println("Athelete eats healthy foods");
    }

     @Override
     void exercise() {
         System.out.println("Athelete exercise regularly");

     }
 }

 class Lazyperson extends Person{
    public void eat() {
        System.out.println("Lazy person eats junk food");
    }

     @Override
     void exercise() {
         System.out.println("Lazy persons don't even exercise");
     }
 }
