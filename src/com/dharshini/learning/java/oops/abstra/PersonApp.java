package com.dharshini.learning.java.oops.abstra;

public class PersonApp {

    public static void main(String[] args) {

        Athelete athelete = new Athelete();
        Lazyperson lazyperson = new Lazyperson();

        athelete.eat();
        lazyperson.eat();

        athelete.exercise();
        lazyperson.exercise();

    }
}
