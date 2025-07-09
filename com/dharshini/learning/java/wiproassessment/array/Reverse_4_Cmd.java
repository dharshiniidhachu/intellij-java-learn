package com.dharshini.learning.java.wiproassessment.array;

public class Reverse_4_Cmd {
    public static void main(String[] args) {
        if(args.length!=4){
            System.out.println("Enter 4 integer numbers");
            return;
        }

        int arr[][] = new int[2][2];
        arr[0][0] = Integer.parseInt(args[0]);
        arr[0][1] = Integer.parseInt(args[1]);
        arr[1][0] = Integer.parseInt(args[2]);
        arr[1][1] = Integer.parseInt(args[3]);

        System.out.println("Array: ");
        System.out.println(arr[0][0] + " " + arr[0][1]);
        System.out.println(arr[1][0] + " " + arr[1][1]);
        System.out.println(arr[1][1] + " " + arr[1][0]);
        System.out.println(arr[0][1] + " " + arr[0][0]);

    }
}
