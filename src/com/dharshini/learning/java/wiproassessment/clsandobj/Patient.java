package com.dharshini.learning.java.wiproassessment.clsandobj;

public class Patient {
    String patientName;
    double height;
    double weight;

    public Patient(String patientName, double height, double weight) {
        this.patientName = patientName;
        this.height = height;
        this.weight = weight;
    }

    double computeBMI(){
        return weight /(height*height);
    }

    public static void main(String[] args) {
        Patient p = new Patient("ABC",5,40);
        double bmi = p.computeBMI();
        System.out.println(bmi);
    }

}
