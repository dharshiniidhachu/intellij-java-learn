package com.dharshini.learning.java.datatypes;

import java.util.ArrayList;

public class ArrayEg {
    public static void main(String[] args) {
        ArrayList<String> states = new ArrayList<>();
        states.add("TamilNadu");
        states.add("Karnataka");
        states.add("Uttar Pradesh");
        states.add("Andhra Pradesh");
        states.add("Gujarat");
        states.add("Kerala");
        states.add("Manipur");
        states.add("Nagaland");
        states.add("Sikkim");
        states.add("Bihar");

        for(int i= 0; i < states.size();i++){

            System.out.println("List of states: " + states.get(i));

        }


    }
}
