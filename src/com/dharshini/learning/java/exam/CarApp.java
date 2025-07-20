package com.dharshini.learning.java.exam;

public class CarApp {
    public static void main(String[] args) {

        Maruti alto = new Alto("Alto","white","220",5,2022);
        Maruti baleno = new Baleno("Baleno","Black","220",5,2023);
        Maruti dzire = new Dzire("Dzire","Red","220",5,2021);
        Maruti wagonR= new WagonR("WagonR","Green","220",5,2024);
        Maruti gpysy = new Gpysy("Gypsy","Grey","150",4,2023);

        alto.mileague();
        baleno.mileague();
        dzire.mileague();
        wagonR.mileague();
        gpysy.mileague();


    }
}
