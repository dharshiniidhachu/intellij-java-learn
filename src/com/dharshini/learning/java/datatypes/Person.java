package com.dharshini.learning.java.datatypes;

public class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    public Person(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "com.dharshini.learning.java.datatypes.Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}

