package com.dharshini.learning.java.pattern;

public class RightTriangle {
    public static void main(String[] args) {
        int n=5;
        int s = 3;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}
