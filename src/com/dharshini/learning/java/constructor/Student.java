package com.dharshini.learning.java.constructor;

class Student {

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name; // Refers to the instance variable
        this.age = age;   // Refers to the instance variable
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

