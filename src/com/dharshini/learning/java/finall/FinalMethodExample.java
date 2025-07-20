package com.dharshini.learning.java.finall;

class Parent {
    final void showMessage() {
        System.out.println("This is a final method.");
    }
}

class Child extends Parent {
    // void showMessage() { System.out.println("cannot override final method");}
}

public class FinalMethodExample{
    public static void main(String[] args) {
        Child child = new Child();
        child.showMessage();
    }
}
