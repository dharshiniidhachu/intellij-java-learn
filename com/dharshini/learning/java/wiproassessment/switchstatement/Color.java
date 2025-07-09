package com.dharshini.learning.java.wiproassessment.switchstatement;

import java.util.Collections;
import java.util.Scanner;

public class Color {

    static void alphabet(char s){
        switch (s){
            case 'R':
                System.out.println("Red");
                break;
            case 'B':
                    System.out.println("Blue");
                    break;
            case 'G':
                    System.out.println("Green");
                    break;
            case 'O':
                    System.out.println("Orange");
                    break;
            case 'Y':
                    System.out.println("Yellow");
                    break;
            case 'W':
                    System.out.println("White");
                    break;
            default:
                System.out.println("Invalid");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char s = sc.next().toUpperCase().charAt(0);
        Color.alphabet(s);
    }
}
