package com.dharshini.learning.java.wiproassessment.inheritan;

class Animal {
    void eat(){
        System.out.println("Eats");
    }
    void sleep(){
        System.out.println("Sleeps");
    }
}
class Bird extends Animal {
    void eat() {
        System.out.println("Bird eats");
    }

    void sleep() {
        System.out.println("Bird sleeps");
    }

    void fly() {
        System.out.println("Bird flys");
    }
}

class Main{
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        a.sleep();
        Bird b = new Bird();
        b.eat();
        b.sleep();
        b.fly();
    }

}
