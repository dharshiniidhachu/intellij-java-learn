package com.dharshini.learning.java.datatypes;

import java.util.ArrayList;

public class NonPrimitiveDataTypes {
    public static void main(String[] args) {
        String name = "John Doe";
                System.out.println("String value: "+ name.length());
        int[] numbers = {10,20,30,40,50};
        System.out.println("Array value at index2:" + numbers[2]);
        System.out.println("Array length: " + numbers.length);

        ArrayList<String> fruits = new ArrayList(0);
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cheery");
        System.out.println("Index 1:" + fruits.get(1));
        System.out.println("Size :" + fruits.size());

        ArrayList<Person> personArrayList = new ArrayList<>();
         personArrayList.add(new Person());
         personArrayList.add(new Person("",25,"" ));


    }
}
enum Day{
    Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
}
