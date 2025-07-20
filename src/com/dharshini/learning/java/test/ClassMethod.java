package com.dharshini.learning.java.test;

public class ClassMethod {
    //main method is user defined method
    public static void main(String[] args) {
        ClassMethod cm = new ClassMethod();
        String myName = cm.getMyName();
        System.out.println("MyName is : " + myName);
        long phoneNo = cm.getMyPhoneNo();
        System.out.println("My phone no : " + phoneNo);
        cm.displayNone();
        System.out.println("Addition o/p is : " + cm.addTwoNo(20, 30));
    }

    private String getMyName() {
        String myName = "MahilTech";
        return myName;
    }

    private long getMyPhoneNo() {
        long phoneNo = 8148454695L;
        return phoneNo;
    }

    private void displayNone() {
        System.out.println("Displaying None");
    }

    private int addTwoNo(int x, int y) {
        return x + y;
    }
}
