package com.dharshini.learning.java.wiproassessment.loop;

public class DivisibleBy_2_3_5 {
    public static void main(String[] args) {
        int n = 1;
        int count =0;
        while(count<5){ //first 5 numbers only
        if(n%2==0 && n%3==0 && n%5==0){
            System.out.println(n);
            count++;
        }
        n++;
    }
}
}
