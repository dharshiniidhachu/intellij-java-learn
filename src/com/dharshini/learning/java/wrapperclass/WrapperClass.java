package com.dharshini.learning.java.wrapperclass;

import java.util.ArrayList;

public class WrapperClass {
    public static void main(String[] args) {
        WrapperClass wrapperClass = new WrapperClass();
        wrapperClass.autoBoxing();
        wrapperClass.autoUnBoxing();
        wrapperClass.wrapperInCollection();
        wrapperClass.parsingString();
        wrapperClass.primitiveToString();
        wrapperClass.Boxing();
    }

    private void primitiveToString() {
        int num = 123;
        String str = Integer.toString(num);
        System.out.println("Converted String : " + str);
    }

    private void parsingString() {
        String str = "123";
        int num = Integer.parseInt(str);
        System.out.println("Parsed int: " + num);
    }

    private void wrapperInCollection() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);

        int num = list.get(0);

        System.out.println("ArrayList: " + list);
        System.out.println("First Element: " + num);
    }

    private void autoBoxing() {
        int num =10;
        Integer obj = num;
        System.out.println("Wrapper Object: " + obj);
        
    }
    private void autoUnBoxing(){
        Integer obj =10;
        int num = obj;
        System.out.println("Primitive value: " + num);
        Boolean b = true;
        String sb = Boolean.toString(b);
        System.out.println("Boolean to String: -"+sb);
        Boolean b1 = Boolean.parseBoolean(sb);
        System.out.println("String to boolean: "+ b1);

    }
    private void Boxing() {
        int a = 5;
        Integer i = Integer.valueOf(a);//Boxing
        int b = i.intValue(); //unboxing

    }
}
