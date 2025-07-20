package com.dharshini.learning.java.constructor.callbyref;

public class ExampleOfACallByReference {

    static class MyObject {
        int value;
    }

    public static void modifyObject(MyObject obj) {
        obj.value = 10;
    }

    public static void reassignObject(MyObject obj) {
        obj = new MyObject();
        obj.value = 20;
    }

    public static void main(String[] args) {
        MyObject obj = new MyObject();
        obj.value = 5;

        System.out.println(obj.value);
        modifyObject(obj);
        System.out.println(obj.value);

        reassignObject(obj);
        System.out.println(obj.value);
    }
}
