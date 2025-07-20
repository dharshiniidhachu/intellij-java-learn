package com.dharshini.learning.java.college;

import java.util.ArrayList;
import java.util.Scanner;

public class NumCraft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();
        ArrayList<Integer> unit = new ArrayList<>();
        ArrayList<Integer> tens = new ArrayList<>();
        ArrayList<Integer> hund = new ArrayList<>();
        ArrayList<Integer> thousand = new ArrayList<>();
        unit.add(n % 10);
        unit.add(m % 10);
        unit.add(l % 10);
        n = n/10;
        m = m/10;
        l = l/10;
        tens.add(n % 10);
        tens.add(m % 10);
        tens.add(l % 10);
        n = n/10;
        m = m/10;
        l = l/10;
        hund.add(n%10);
        hund.add(m%10);
        hund.add(l%10);
        n = n/10;
        m = m/10;
        l = l/10;
        thousand.add(n%10);
        thousand.add(m%10);
        thousand.add(l%10);

        int max = 0;
        int min = Integer.MAX_VALUE;
        int max2 = 0;
        int min2 = Integer.MAX_VALUE;
        for (int i =0;i<unit.size();i++) {
            if (unit.get(i)>max) {
                    max = unit.get(i);
                }
            }
        for (int i = 0;i<tens.size();i++) {
            if(tens.get(i)<min) {
                min = tens.get(i);
            }
        }
        for(int i = 0;i<hund.size();i++) {
            if(hund.get(i)>max2){
                max2 = hund.get(i);
            }
        }
        for (int i =0;i<thousand.size();i++) {
            if(thousand.get(i)<min2) {
                min2 = thousand.get(i);
            }
        }
        System.out.print(min2);
        System.out.print(max2);
        System.out.print(min);
        System.out.print(max);
        }

    }

