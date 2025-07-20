package com.dharshini.learning.java.college;

import java.util.Scanner;

public class TaxCalculation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter annual income: ");
        float annualIncome = sc.nextFloat();
        System.out.println("Enter no.of.dependents: ");
        int dependents = sc.nextInt();
        float taxRate;
        if (annualIncome < 0) {
            System.out.println("Give positive income");
        }
        else if(annualIncome>80000 & dependents==0) {
            taxRate = annualIncome/100*30;
            System.out.printf("%.2f" ,taxRate);
        } else if (annualIncome>80000 & dependents >0) {
            taxRate = annualIncome/100*20;
            System.out.printf("%.2f",taxRate);
        } else if (annualIncome<=80000 ) {
            taxRate = annualIncome/100*10;
            System.out.printf("%.2f",taxRate);
        } else {
            System.out.println("Invalid");
        }

    }
}
