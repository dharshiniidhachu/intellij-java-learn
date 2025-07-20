package com.dharshini.learning.java.constructor;

import java.util.ArrayList;

public class PersonsApp1 {
    public static void main(String[] args) {

        ArrayList<Persons> a = new ArrayList<>();
        a.add(new Persons("Daina Jessica", 8148454695L, 40, "KNP", "NKL", "NKL"));
        a.add(new Persons("Arferd", 9994304695L, 30, "Kaaravalli", "NKL", "NKL"));
        a.add(new Persons("Arferd daison", 8767567809L, 38, "SENDHAMANGALAM", "COIMBATORE", "COIMBATORE"));
        a.add(new Persons("DHARSHINI", 9994473777L, 20, "KNP", "NKL", "NKL"));
        a.add(new Persons("Sivakumar Venkatasamy", 9087604321L, 30, "Mohanur", "NKL", "NKL"));
        a.add(new Persons("Harry", 8765432905L, 45, "Kaaravalli", "NKL", "NKL"));
        a.add(new Persons("Trisha", 9874304697L, 60, "Chidhambaram", "Salem", "Salem"));
        a.add(new Persons("Bappy laiten", 8124304656L, 56, "thirumalapatti", "NKL", "NKL"));
        a.add(new Persons("John", 9943765435L, 35, "KNP", "NKL", "NKL"));
        a.add(new Persons("Hardik Pandya", 8144304690L, 32, "Lalghatt", "Gujarat", "Gujarat"));

        for (Persons person : a) {
            if (person.getAge() >= 35 && person.getAge() <= 45) {
                System.out.println("com.dharshini.learning.java.constructor.Persons between the age 35 and 45: " + person.getName() + " Age: " + person.getAge());
            }
        }

        for (Persons person : a) {
            if (person.getName().length() > 10) {
                System.out.println("person with more than 10 characters: " + person.getName());
            }
        }

        for (Persons person : a) {
            if (person.getPhoneNo() % 10 == 5) {
                System.out.println(" com.dharshini.learning.java.constructor.Persons with phone no ends in 5 :" + person.getName() + "Phone: " + person.getPhoneNo());
            }
        }

    }
}
