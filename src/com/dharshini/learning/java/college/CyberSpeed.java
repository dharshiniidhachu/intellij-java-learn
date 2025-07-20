package com.dharshini.learning.java.college;

import com.dharshini.learning.java.innerclass.StaticOuter;

import java.util.Scanner;

public class CyberSpeed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter speed in km/hr: ");
        int s = sc.nextInt();
        if(s<0) {
            System.out.println("Oops Fuel is too low");
        } else if (s==0) {
            System.out.println("oops start the car");
        } else if (s>=1 && s<=60) {
            System.out.println("you are driving safely keep it up");
        } else if (s>=61 && s<=70) {
            System.out.println("warning you are slightly over the speed limit");

        } else if (s>70 && s<=200) {
            System.out.println("you are speeding you will receive a ticket");
        } else {
            System.out.println("Invalid input");

        }
    }
}
