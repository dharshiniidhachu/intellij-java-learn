package com.dharshini.learning.java.wiproassessment.array;

public class BiggestNumber_Cmd {
    public static void main(String[] args) {
        if(args.length!=9){
            System.out.println("Enter 9 elements");
            return;
        }
        int arr[][] = new int[3][3];
        int in = 0;
        for (int i =0;i<3;i++){
            for (int j=0;j<3;j++){
                arr[i][j] = Integer.parseInt(args[in]);
                in++;
            }
        }
        for (int i =0;i<3;i++){
            for (int j =0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int big = arr[0][0];
        for (int i =0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] > big) {
                    big = arr[i][j];
                }
            }
        }
        System.out.println(big);
    }
}
