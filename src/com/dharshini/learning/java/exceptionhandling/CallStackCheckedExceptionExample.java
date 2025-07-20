package com.dharshini.learning.java.exceptionhandling;

public class CallStackCheckedExceptionExample {

    public static void main(String[] args) {

        try {
            checkedExceptionMethodA();
        }catch (ArithmeticException ae) {
            System.out.println("Exception : " +ae.getMessage());
        }

    }


    public static void checkedExceptionMethodA() throws ArithmeticException{

        checkedExceptionMethodB();

    }

    public static void checkedExceptionMethodB() throws ArithmeticException {

        int i = 10/0;

    }
}

