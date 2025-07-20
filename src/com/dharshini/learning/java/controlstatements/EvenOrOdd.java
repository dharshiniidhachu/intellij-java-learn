package com.dharshini.learning.java.controlstatements;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println(num + " is a even number");
        }
        else{
            System.out.println(num + " is a odd number");
        }
    }
}
