package com.dharshini.learning.java.college;

import java.util.Scanner;

public class UsingMethod {
    public static int count(String str){
        int count = 0;
        str = str.toLowerCase();
        for(int i =0;i<str.length();i++) {
            char c = str.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
                count++;
            }
        }
        return count;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        


    }

}
