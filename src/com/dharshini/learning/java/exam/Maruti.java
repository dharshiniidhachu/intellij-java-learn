package com.dharshini.learning.java.exam;

class Maruti {
    String name;
    String color;
    String engineCapacity;
    int gear;
    int year;

    public Maruti(String name,String color,String engineCapacity,int gear,int year){
        this.name = name;
        this.color = color;
        this.engineCapacity = engineCapacity;
        this.gear = gear;
        this.year = year;
    }
    public void mileague(){
        System.out.println(name + " gives mileague 22kmpl");
    }

    @Override
    public String toString() {
        return "Maruti{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", engineCapacity='" + engineCapacity + '\'' +
                ", gear=" + gear +
                ", year=" + year +
                '}';
    }
}
