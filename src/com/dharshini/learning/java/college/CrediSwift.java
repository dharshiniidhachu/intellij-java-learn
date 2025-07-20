package com.dharshini.learning.java.college;

import java.util.Scanner;

public class CrediSwift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter credit score: ");
        int creditScore = sc.nextInt();
        System.out.println("Enter Income: ");
        float income = sc.nextFloat();
        System.out.println("Enter debt: ");
        float debt = sc.nextFloat();
        System.out.println("Enter amount request: ");
        float amtRequest = sc.nextFloat();
        float dti;

        if (creditScore > 300 | creditScore <850) {
            dti = (debt/income) * 100;
            if(dti > 40) {
                System.out.println("Denied due to high debt-to-income ratio");
            }
            else if (dti <= 40) {
                    if(creditScore>=750) {
                    System.out.println("approved with the best interest rate");
                } else if (700<=creditScore & creditScore<750) {
                    System.out.println(" approved with a standard interest rate");
                } else if (creditScore < 700) {
                    System.out.println("denied due to low credit score");
                }
            }
        }




    }
}
