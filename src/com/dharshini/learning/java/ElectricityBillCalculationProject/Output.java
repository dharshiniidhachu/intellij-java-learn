package com.dharshini.learning.java.ElectricityBillCalculationProject;

import java.util.Scanner;

import static java.lang.Math.round;

public class Output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Account Number: ");
        String accountNumber = sc.next();

        System.out.println("Enter Customer First Name: ");
        String customerFirstName = sc.next();

        System.out.println("Enter Customer Last Name: ");
        String customerLastName = sc.next();

        double l = customerFirstName.length();
        double totalUnits =  round((l)/2.7*100);
        System.out.println(totalUnits);

        if(accountNumber.endsWith("77"))
        {
            System.out.println("Residential");

            if(totalUnits>0 && totalUnits<101)
            {
                int r = 0;
                double b = (int) r*totalUnits;
                System.out.println("Total Bill: " +b);
            }

            else if (totalUnits>100 && totalUnits<201)
            {
                int r = 4;
                double b = (int) r*totalUnits;
                System.out.println("Total Bill: " +b);
            }

            else
            {
                double r = 4.5;
                double b = (int) r*totalUnits;
                System.out.println("Total Bill: " +b);
            }
        }

        else if (accountNumber.endsWith("88"))
        {
            System.out.println("Commercial");
            int r = 10;
            double b = (int) r*totalUnits;
            System.out.printf("Total Bill: " +b);
        }

        else
        {
            System.out.println("Invalid");
        }

    }
}
