package com.dharshini.learning.java.test;

public class HasARelation {

    public static void main(String[] args) {

        Cloth cloth = new Cloth("Cotton");

        Kurti kurti = new Kurti("Aavasaa", cloth);

        kurti.displayDetails();
    }
}
