package com.dharshini.learning.java.oops.inter;

interface Shape {

    double getArea();

}

class Circle implements Shape{

    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(4.0);
        System.out.println("Area of circle: " + circle.getArea());
    }
}

