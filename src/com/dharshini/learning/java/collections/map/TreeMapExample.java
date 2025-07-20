package com.dharshini.learning.java.collections.map;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {

        TreeMap<String,Integer> stockPrices =  new TreeMap<>();

        stockPrices.put("Microsoft",299);
        stockPrices.put("Google",2800);
        stockPrices.put("Apple",150);

        System.out.println("Stock Prices in Sorted Order:");
        for(String company : stockPrices.keySet()){
            System.out.println("Company: " + company + "' Prices: $" + stockPrices.get(company));
        }
    }
}
