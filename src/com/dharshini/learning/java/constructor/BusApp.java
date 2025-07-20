package com.dharshini.learning.java.constructor;

import java.util.ArrayList;

public class BusApp {

    public static void main(String[] args) {

        ArrayList<Bus> a = new ArrayList<>();

        a.add(new Bus(101, "11", "001", "Vijay", true));
        a.add(new Bus(102, "12", "002", "Dhanush", true));
        a.add(new Bus(103, "13", "003", "Siva", false));
        a.add(new Bus(104, "14", "004", "Kumar", true));
        a.add(new Bus(105, "15", "005", "Ajith", false));



        int countdispatch = 0;
        int countparking = 0;

        for(Bus bus : a)
        {
            if(bus.isOutForPick()==true)
            {
                System.out.println("Buses currently dispatched to pick up students: " + bus.getBusNo());
                countdispatch++;
            }
            else
            {
                System.out.println("Buses available in the parking lot: " +bus.getBusNo());
                countparking++;
            }
        }
        System.out.println("NO OF BUSES DISPATCHED: " +countdispatch);
        System.out.println("NO OF BUSES IN PARKING LOT: " +countparking);
    }
}
