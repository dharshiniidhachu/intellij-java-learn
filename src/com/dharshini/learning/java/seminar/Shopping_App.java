package com.dharshini.learning.java.seminar;

import java.util.*;

public class Shopping_App {
    public static void main(String[] args) {
        ArrayList<String> cart_1 = new ArrayList<>();
        cart_1.add("Shirt");
        cart_1.add("Shirt");
        cart_1.add("Shoes");

        Set<String> categories = new HashSet<>();
        categories.add("Clothing");
        categories.add("Footwear");

        HashMap<String, Double> prices = new HashMap<>();
        prices.put("Shirt", 799.0);
        prices.put("Shoes", 1299.0);
        prices.put("Phone", 20000.0);

        LinkedHashMap<String, Double> orderedPrices = new LinkedHashMap<>();
        orderedPrices.put("Shirt", 799.0);
        orderedPrices.put("Shoes", 1299.0);
        orderedPrices.put("Phone", 20000.0);


        System.out.println(prices);
        System.out.println(orderedPrices);
    }

    /*

        LinkedHashMap<String, Boolean> cart = new LinkedHashMap<>();
        view(cart,"Shirt");
        view(cart,"Shoe");
        view(cart,"Phone");
        view(cart,"Shoe");

        System.out.println(recent);
    }
    public static void view(LinkedHashMap<String,Boolean> cart,String product ){
        recent.remove(product);
        recent.put(product,true);

    }

     */

}
