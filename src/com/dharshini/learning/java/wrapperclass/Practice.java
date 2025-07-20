package com.dharshini.learning.java.wrapperclass;

public class Practice {
    public static void main(String[] args) {

        String name = "DharShini";
        String st = "";
        for(int i = 0;i<name.length();i++) {
            char c = name.charAt(i);
            if(Character.isLowerCase(c)){
                st = st+Character.toUpperCase(c);
            }
            else{
                st = st+Character.toLowerCase(c);
            }
        }
        System.out.println(st);
    }
}
