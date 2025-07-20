package com.dharshini.learning.java.constructor;

public class ThisKeywordExample {
    public static void main(String[] args) {
        Student student = new Student("Dhachu", 20);
        student.display();
        student.setName("Dhachu");
        student.setAge(22);
        student.display();
    }
}