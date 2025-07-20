package com.dharshini.learning.java.housetaxcalculation;

import java.util.ArrayList;

public class HouseApp {
    public static void main(String[] args) {
        ArrayList<House> a = new ArrayList<>();

        a.add(new House(790,"Mud Brick",2,1949,0));
        a.add(new House(2620,"Concrete Roofing",4,2022,2));
        a.add(new House(1384,"Steel Roofing",1,2016,4));
        a.add(new House(580,"Palm leaf",1,2008,0));

        double totalTax = 0;

        for(House house : a) {
            double tax = 1;
            if (house.getType().equals("Mud Brick"))
            {
                tax = 1.5;
            }
            else if (house.getType().equals("Concrete Roofing"))
            {
                tax = 4;
            }
            else if (house.getType().equals("Steel Roofing")) {
                tax = 3.4;
            }
            else if (house.getType().equals("Palm leaf"))
            {
                tax = 0.8;
            }
            double taxx = house.getSize()* house.getPendingYears()*tax;
            totalTax = totalTax + taxx;
            System.out.println("Tax for each house is " +taxx);
        }
        System.out.println("Total tax is : " +totalTax);
    }
    }