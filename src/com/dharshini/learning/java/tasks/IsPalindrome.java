package com.dharshini.learning.java.tasks;

import java.util.Scanner;

class IsPalindrome {
        public static int isPalindromePossible(int input1) {
            int[] count = new int[10];
            while (input1 > 0) {
                int ld = input1 % 10;
                count[ld] = count[ld] + 1;
                input1 /= 10;
            }
            int oddCount = 0;
            for (int i = 0; i < 10; i++) {
                if (count[i] % 2 != 0) {
                    oddCount++;
                    if (oddCount > 1) {
                        return 1;
                    }
                }
            }
            return 2;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            int result = isPalindromePossible(input);
            System.out.println( result);
        }
    }

