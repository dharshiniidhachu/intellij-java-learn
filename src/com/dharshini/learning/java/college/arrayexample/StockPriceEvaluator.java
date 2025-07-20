package com.dharshini.learning.java.college.arrayexample;

import java.util.Scanner;

public class StockPriceEvaluator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max =Integer.MIN_VALUE;
        int min =Integer.MAX_VALUE;
        float sum =0;
        for(int i =0;i<n;i++){
            int prices = sc.nextInt();
            if(prices>max){
                max = prices;
            }
            if(prices<min) {
                min = prices;
            }
            sum = sum + prices;
        }
        float avg = sum/n;
        System.out.println(max);
        System.out.println(min);
        System.out.printf("%.2f",avg);
        }
    }

