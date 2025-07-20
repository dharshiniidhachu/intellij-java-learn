package com.dharshini.learning.java.college;

import static com.dharshini.learning.java.college.Var.a;

public class CheckingTwoNumbers {

        public static void main(String[] args) {
            System.out.println(CheckingTwoNumbers.equal(8,8));

    }
    public static boolean equal(int a,int b) {
        boolean b1 = (a^b) ==0;
        return b1;
    }

}
