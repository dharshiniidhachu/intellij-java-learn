package com.dharshini.learning.java.datatypes;

public class PersonApp {
    public static void main(String args[]){
        Person person1 = new Person();
        person1.setName("Daina");
        person1.setAge(15);
        person1.setGender("Female");
        Person person2 = new Person();
        person2.setName("Harry");
        person2.setAge(17);
        person2.setGender("Male");

        System.out.println("com.dharshini.learning.java.datatypes.Person 1:"+person1);
        System.out.println("com.dharshini.learning.java.datatypes.Person 2:"+person2);
    }}
