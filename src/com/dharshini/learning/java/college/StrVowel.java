package com.dharshini.learning.java.college;

import java.util.Scanner;

public class StrVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = 0;
        str = str.toLowerCase();
        for(int i =0;i<str.length();i++) {
          char c = str.charAt(i);
          if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
              count++;
          }
        }
        System.out.println(count);

    }
}
