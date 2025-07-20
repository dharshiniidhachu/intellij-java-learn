package com.dharshini.learning.java.controlstatements;

import java.util.Scanner;

public class PracticeQuestion3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");

        int num = sc.nextInt();
        if(num>450 && num<512){
            System.out.println("Close to half GB");
        }

        else if(num<320 && num>256){
            System.out.println("Just above quarter GB");
        }

        else{
            System.out.println("Invalid Number");
        }
    }
}
