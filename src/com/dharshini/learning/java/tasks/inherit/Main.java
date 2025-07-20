package com.dharshini.learning.java.tasks.inherit;
class GrandParent{
    String name;

     GrandParent(String name) {
        this.name = name;
    }
    void show(){
        System.out.println(name);
    }
}
class Parent extends GrandParent{
    int age;

    public Parent(String name, int age) {
        super(name);
        this.age = age;
    }
    void show(){
        super.show();
        System.out.println(age);
    }
}
class Child extends Parent{
    String school;

    public Child(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }
    void show(){
        super.show();
        System.out.println(school);
    }
}
public class Main {
    public static void main(String[] args) {

        Child c = new Child("Dhachu", 12, "KMS");
        c.show();
    }
}
