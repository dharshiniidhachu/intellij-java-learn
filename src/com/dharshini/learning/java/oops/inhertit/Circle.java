package com.dharshini.learning.java.oops.inhertit;

 class Circle extends Shape{

     private double radius;

     public Circle(double radius){
         this.radius = radius;
     }

     @Override
     public double getArea() {
         return Math.PI * radius * radius;
     }
 }
