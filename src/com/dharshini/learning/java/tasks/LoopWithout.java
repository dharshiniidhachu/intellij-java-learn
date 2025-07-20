package com.dharshini.learning.java.tasks;

import java.util.Scanner;

public class LoopWithout {

    public static void num(int n){
        if(n==0)
            return;
        num(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        num(n);

    }
}
