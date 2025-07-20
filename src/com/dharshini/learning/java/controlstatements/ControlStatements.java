package com.dharshini.learning.java.controlstatements;

public class ControlStatements {
    public static void main(String[] args) {
        /* int n=20;

        if(n>=18){
            System.out.println("Elgible for voting");
        }
        else{
            System.out.println("Not eligible for voting");
        }

         */



        int m1=70;
        int m2=80;
        int m3=40;

        int avg=(m1+m2+m3)/3;

        if(avg>=90){
            System.out.println("Grade A");
        }
        else if(avg>=80){
            System.out.println("Grade B");
        }
        else if(avg>=70){
            System.out.println("Grade C");
        }
        else{
            System.out.println("Grade D");
        }


        for(int a=1;a<=10;a++)
        if(a%2==0){
            System.out.println("Numbers divisible by 2 are : " + a);
        }

    }




}
