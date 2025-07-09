package com.dharshini.learning.java.wiproassessment.inheritan;

public class Test {
    public static void main(String[] args) {
        System.out.println("Person: ");
        Persons p = new Persons("Dhachu","18/09/2004");
        p.displayPersons();
        System.out.println("Teacher: ");
        Teacher t = new Teacher("ABC","1/1/1999",30000.00,"GEN AI");
        t.displayTeacher();
        System.out.println("Student: ");
        Student s = new Student("Shalu","02/09/2005",12);
        s.displayStudent();
        System.out.println("College Student: ");
        CollegeStudent c = new CollegeStudent("Bueno","29/08/2006",6,"KNCET",1);
        c.displayCollegeStudent();


    }
}
