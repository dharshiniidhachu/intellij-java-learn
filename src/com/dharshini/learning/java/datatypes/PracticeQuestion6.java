package com.dharshini.learning.java.datatypes;

public class PracticeQuestion6 {
    public static void main(String[] args)
    {


      /*  int max = arr[0];

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i] > max)
                max = arr[i];
        }

        System.out.println("Maximum Number: " +max);

        System.out.println("Sorted array by using method: ");
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++) {
            System.out.print( " " + arr[i]);
        }
        System.out.println();

*/
        System.out.println("Sorted array without using method: ");

        int arr[] = {29,45,23,98,9,12,44,78};

        for(int i = 0; i < arr.length; i++){

            for(int j = 0; j < arr.length; j++){
                System.out.println("i " + i + " j " + j + " arr[i] : "+ arr[i] + " arr[j] " + arr[j] + " arr[i] " + arr[i]);

                if(arr[i] < arr[j]) {

                   int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;

                    System.out.println("i " + i + " j " + j + " arr[i] : "+ arr[i] +"  temp  " + temp + " arr[j] " + arr[j] + " arr[i] " + arr[i]);

                 } else {
                    System.out.println("i " + i + " j " + j + " arr[i] : "+ arr[i] + " arr[j] " + arr[j] + " arr[i] " + arr[i]);
                }

            }
        }

        for(int i : arr) {
            System.out.print( i + " ");
        }
    }
}
