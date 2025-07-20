package com.dharshini.learning.java.wiproassessment.inheritan;

class Teacher extends Persons{
    double salary;
    String subject;


    public Teacher(String name, String dob, double salary, String subject) {
        super(name, dob);
        this.salary = salary;
        this.subject = subject;
    }

    void displayTeacher(){
        System.out.println(salary);
        System.out.println(subject);
    }
}
