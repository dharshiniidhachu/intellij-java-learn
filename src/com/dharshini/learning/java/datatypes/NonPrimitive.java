package com.dharshini.learning.java.datatypes;

import java.util.ArrayList;

public class NonPrimitive {

    public static void main(String[] args) {

        String name = "Dharshini Sivakumar";
        System.out.println("Hi! I'm " + name);
        System.out.println("Length of name: " + name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        int[] arr={10,20,30,40,50};
        System.out.println("Array value at index 0: " + arr[0]);
        System.out.println("Length of the array: " + arr.length);

        Person person= new Person("Shalini", 15,"Female");
        System.out.println("Name: " + person.getName()+ ",Age: " +person.getAge() +",Gender: " +person.getGender());

        ArrayList<String> personList = new ArrayList<>();

        personList.add("Nandhini");
        personList.add("Bueno");
        personList.add("Gowtham");

        System.out.println("Lists of personLists: " +personList);
        System.out.println("com.dharshini.learning.java.datatypes.Person at INDEX 1: " +personList.get(1));
        personList.add(0,"Shalini");
        System.out.println("After adding: " +personList);
        System.out.println("Size of the ArrayList:" + personList.size());

        for(String a : personList){
            System.out.println("Iterating: " + a);
        }




    }
}
