package com.dharshini.learning.java.datatypes;

public class ArrayExampleNew {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        String b[] = {"Dhachu", "shalu", "nandhu"};

        String s = "Today is a beautiful day";
        char s1[] = s.toCharArray();
        for(int i = 0; i < s1.length ; i++) {
            System.out.println("character array:" + s1[i]);
        }

        String strArray[] = s.split(" ");
        for(String s2:strArray){
            System.out.println("String values : " + s2);
        }
    }

}
