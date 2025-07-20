package com.dharshini.learning.java.oops.inter;

interface Vehicle {

    void start();

}

interface ElectricVechicle extends Vehicle {

    void chargeBattery();

}

class Tesla implements ElectricVechicle {

    @Override
    public void chargeBattery()
    {
        System.out.println("Charging Batteries");
    }

    @Override
    public void start() {
        System.out.println("Tesla is Starting");
    }


}
