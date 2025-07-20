package com.dharshini.learning.java.classobjects;

import java.util.ArrayList;

public class DogApp {
    public static void main(String args[]){
            Dog dog1 = new Dog();
            dog1.setBreed("puppy");
            dog1.setSize("small");
            dog1.setColor("white");
            dog1.setAge(4);

            Dog dog2 = new Dog();
            dog2.setBreed("german");
            dog2.setColor("brown");
            dog2.setSize("large");
            dog2.setAge(7);

            ArrayList<Dog> dogList = new ArrayList<>();
            dogList.add(dog1);
            dogList.add(dog2);

            for(int i=0; i < dogList.size();i++){
                    System.out.println("List of dog objects : " + dogList.get(i));
            }


    }
}
