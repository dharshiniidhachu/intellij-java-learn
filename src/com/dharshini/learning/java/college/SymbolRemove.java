package com.dharshini.learning.java.college;

import java.util.Scanner;

public class SymbolRemove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        for(int i = 0;i<s.length();i++) {
            char c = s.charAt(i);
            if(!((c>='a'&&c<='z') || (c>='A'&&c<='Z') || (c>='0'&& c<='9'))) {
                count++;

            }
        }
        System.out.println(count);
    }
}
