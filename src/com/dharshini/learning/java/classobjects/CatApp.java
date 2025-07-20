package com.dharshini.learning.java.classobjects;

import java.util.ArrayList;

public class CatApp {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setAge(3);
        cat1.setColor("Brown");
        cat1.setName("Tuno");

        Cat cat2 = new Cat();
        cat2.setAge(2);
        cat2.setColor("Black");
        cat2.setName("Martin");

        ArrayList<Cat> catList = new ArrayList<>();
        catList.add(cat1);
        catList.add(cat2);

        for(int i=0;i < catList.size();i++){
            System.out.println("List of objects of cat : " + catList.get(i));
        }
    }
}
