package com.dharshini.learning.java.wiproassessment.IfStatement;

import java.util.Scanner;

public class InitializeDataType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.next().charAt(0);
        if(a>='a'&&a<='z'||a>='A'&&a<='Z'){
            System.out.println("Alphabet");
        } else if (a>='0' && a<= '9') {
            System.out.println("Digit");
        }else {
            System.out.println("Special Character");
        }
    }
}
