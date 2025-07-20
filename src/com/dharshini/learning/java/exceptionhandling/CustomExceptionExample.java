package com.dharshini.learning.java.exceptionhandling;

class CustomException extends Exception {

    public CustomException(String message){
        super(message);
    }
}

public class CustomExceptionExample{

    public static void main(String[] args) throws CustomException {
        try {
            validateAge(12);
        } catch (CustomException e) {
            System.out.println("Custom exception caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Big bucket error catch block");
        }
    }

    static void validateAge(int age) throws Exception {
        if(age < 18) {
            throw new Exception("Age must be atleast 18");
        }
    }
}

