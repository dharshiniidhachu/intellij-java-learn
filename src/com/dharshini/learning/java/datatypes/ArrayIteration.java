package com.dharshini.learning.java.datatypes;

public class ArrayIteration {
    public static void main(String[] args) {

        String[] names ={"Dhachu","Shalu","Bueno"};

        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }

        for(String name : names){  //Enhanced for loop
            System.out.println(name);
        }
    }
}
