package com.dharshini.learning.java.wiproassessment.inheritan;

class Student extends Persons {
    private int id;

    public Student(String name, String dob, int id) {
        super(name, dob);
        this.id = id;
    }

    void displayStudent(){
        System.out.println(id);}
}