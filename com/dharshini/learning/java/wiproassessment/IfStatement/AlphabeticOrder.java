package com.dharshini.learning.java.wiproassessment.IfStatement;

import java.util.Scanner;

public class AlphabeticOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        char c1 = sc.next().charAt(0);
        if(c<c1){
            System.out.println(c+","+c1);
        }else {
            System.out.println(c1+","+c);
        }

    }
}
