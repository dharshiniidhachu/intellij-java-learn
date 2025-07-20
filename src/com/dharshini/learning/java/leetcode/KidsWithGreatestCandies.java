package com.dharshini.learning.java.leetcode;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestCandies {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){

        int max=0;  //for seeing maxi candies
        for(int candy : candies){
            if(candy>max){
                max=candy;
            }
        }

        List<Boolean> result = new ArrayList<>();
        for(int candy : candies){
            if(candy+extraCandies>=max){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;

    }

    public static void main(String[] args) {

        int[] candies1 ={2,3,5,1,3};
        int extraCandies1 = 3;

        System.out.println(kidsWithCandies(candies1,extraCandies1));
    }
}
