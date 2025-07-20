package com.dharshini.learning.java.exam;

public class Kilometres {
    public static void main(String[] args) {
        double city = 30.0;
        double hills = 25.0;
        double highway = 45.0;

        double km = 600.0;

        Kilometres travel = new Kilometres();
        System.out.println(travel.distance(km,city));
        System.out.println(travel.distance(km,hills));
        System.out.println(travel.distance(km,highway));

    }
    public double distance(double km, double dist){
        return (km/100)*dist;

    }
}
