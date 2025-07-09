package com.dharshini.learning.java.wiproassessment.clsandobj;

public class Calculator {
    static int powerInt(int num1,int num2){
        return (int) Math.pow(num1,num2);
    }
    static double powerDouble(double num1,int num2){
        return Math.pow(num1,num2);
    }

    public static void main(String[] args) {
        int result = Calculator.powerInt(2,3);
        double result2 = Calculator.powerDouble(3.0,6);
        System.out.println(result);
        System.out.println(result2);;
    }
}
