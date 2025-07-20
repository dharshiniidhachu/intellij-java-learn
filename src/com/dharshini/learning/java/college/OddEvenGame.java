package com.dharshini.learning.java.college;

import java.util.ArrayList;
import java.util.Scanner;

public class OddEvenGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        for(int i=0;i<n;i++) {
            int num = sc.nextInt();
            if(num%2==0) {
                even.add(num);
            }else {
                odd.add(num);
            }
        }
        for (int e : even){
            System.out.println(e);
        }
        for (int o : odd) {
            System.out.println(o);
        }

    }
}
