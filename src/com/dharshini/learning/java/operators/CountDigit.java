package com.dharshini.learning.java.operators;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println("Count is 1");
        }
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        System.out.println("Count is " + count);
    }
}
        /*

        String number ="8672356452779";

        try{
            Long.parseLong(number);
            System.out.println(number.length());
        }catch (Exception e){
            System.out.println();
        }

        }

}

         */
