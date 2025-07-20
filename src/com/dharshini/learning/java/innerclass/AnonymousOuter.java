package com.dharshini.learning.java.innerclass;

public class AnonymousOuter {

    interface Greeting{
        void sayHello();
    }

    public static void main(String[] args) {

        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello from anonymous inner class");
            }
        };

        greeting.sayHello();
    }
}
