package com.dharshini.learning.java.college.arrayexample;

import com.dharshini.learning.java.innerclass.StaticOuter;

import java.util.Scanner;

public class ThresholdJump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secretNo = sc.nextInt();
        int guess = sc.nextInt();
        if(guess==0){
            System.out.println("Sorry, you’ve no triesto search. The number was"+secretNo);
        }
        for(int i =1;i<=guess;i++) {
            int represent = sc.nextInt();
            if(represent==secretNo){
                System.out.println("Congratulations! You guessed the number");
                break;
            }
            else if (i>=guess) {
                System.out.println("Sorry, you’ve used all your tries. The number was " + secretNo);
            }else if (represent<secretNo) {
                System.out.println("Too low, try again:");
            } else if (represent>secretNo) {
                System.out.println("Too high, try again:!");
            } else {
                System.out.println("provide valid number");
            }
            }

        }
        }



