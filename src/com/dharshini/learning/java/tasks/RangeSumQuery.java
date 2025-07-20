package com.dharshini.learning.java.tasks;

import java.util.Scanner;

public class RangeSumQuery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if(n1>=0&&n1<=9999 && n2>=0 &&n2<=9999 && n1<n2){
            int sum =0;
            for (int i =n1;i<=n2;i++){
                sum = sum + i;
            }
            System.out.println(sum);

        }else {
            System.out.println("INVALID INPUT");
        }


    }
}
