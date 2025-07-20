package com.dharshini.learning.java.oops.abstra;

abstract class Vehicle {
    String brand;
    Vehicle(String brand){
        this.brand = brand;
    }
    void showBrand(){
        System.out.println(brand);
    }
    abstract void start();
}
class Car extends Vehicle{
    String model;

    public Car(String brand, String model) {
        super(brand);
        this.model = model;
    }
    void start(){
        System.out.println(model + " is Starting");
    }
    void showDetails(){
        this.start();
        System.out.println(brand);
        System.out.println(model);
    }
} class Main_1{
    public static void main(String[] args) {
        Car c = new Car("KIA","2.0");
        c.showDetails();
    }
}
