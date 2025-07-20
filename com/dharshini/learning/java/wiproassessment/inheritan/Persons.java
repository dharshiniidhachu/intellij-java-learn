package com.dharshini.learning.java.wiproassessment.inheritan;

public class Persons {
    private String name;
    private String  dob;

    Persons(String name,String dob){
        this.name = name;
        this.dob = dob;
    }
    void displayPersons(){
        System.out.println(name);
        System.out.println(dob);
    }
}
