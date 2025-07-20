package com.dharshini.learning.java.college;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FactorsOfNumber {
    static ArrayList<Integer> factor(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =1;i<=n;i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = factor(n);
        for(int li:list) {
            System.out.println(li);
        }

    }
}
