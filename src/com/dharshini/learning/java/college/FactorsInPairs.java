package com.dharshini.learning.java.college;

import java.util.ArrayList;
import java.util.Collections;

public class FactorsInPairs {
    static ArrayList<Integer> factor(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                if(n/i==i){
                    list.add(i);
                }
                else {
                    list.add(i);
                    list.add(n/i);
                }
            }
        }
        return list;

    }
    public static void main(String[] args) {
        int n = 100;
        ArrayList<Integer> list = factor(n);
        Collections.sort(list);
        for(int li:list ){
            System.out.print(li + " ");
        }


    }
}
