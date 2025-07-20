package com.dharshini.learning.java.block;

public class Practice {

    // Static method so it can be called without creating an object
    public static int findKey(int input1, int input2, int input3) {
        // Get thousands digit of input1
        int thousandsDigit = (input1 / 1000) % 10;

        // Get hundreds digit of input2
        int hundredsDigit = (input2 / 100) % 10;

        // Find the smallest digit in input3
        int minDigit = 9;
        int temp = input3;
        while (temp > 0) {
            int digit = temp % 10;
            if (digit < minDigit) {
                minDigit = digit;
            }
            temp /= 10;
        }

        // Calculate and return the Key
        return (thousandsDigit * hundredsDigit) + minDigit;
    }
}