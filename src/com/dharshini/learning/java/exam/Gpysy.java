package com.dharshini.learning.java.exam;

class Gpysy extends Maruti {
    public Gpysy(String name, String color, String engineCapacity, int gear, int year) {
        super(name, color, engineCapacity, gear, year);
    }
    @Override
    public void mileague(){
        System.out.println(name + "gives 15 kmpl");
    }

}
