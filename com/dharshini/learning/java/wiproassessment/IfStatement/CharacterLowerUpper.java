package com.dharshini.learning.java.wiproassessment.IfStatement;

import java.util.Scanner;

public class CharacterLowerUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if(Character.isLowerCase(c)){
            System.out.println(Character.toUpperCase(c));
        } else if (Character.isUpperCase(c)) {
            System.out.println(Character.toLowerCase(c));
        }else {
            System.out.println("Invalid");
        }
    }
}
