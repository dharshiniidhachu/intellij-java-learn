package com.dharshini.learning.java.wiproassessment.Polymorphism;

class Apple extends Fruit{
    public Apple( int size) {
        super("APPLE", "SWEET", size);
    }

    void eat(){
        System.out.println(name);
        System.out.println(taste);
        System.out.println(size);
    }
}
class Orange extends Fruit {
    public Orange(int size) {
        super("ORANGE", "SOUR", size);
    }

    void eat(){
        System.out.println(name);
        System.out.println(taste);
        System.out.println(size);
    }
}
public class Main {
    public static void main(String[] args) {
        Apple a = new Apple(10);
        a.eat();
        System.out.println("------------------");
        Orange o = new Orange(20);
        o.eat();
    }
}
