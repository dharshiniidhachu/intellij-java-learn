package com.dharshini.learning.java.str;

public class StringEg {

    public static void main(String[] args) {

        char ch = 'A';
        System.out.println((char)('A' + 32));
        //binary so checking data type int is high so A convert to 65  giving bracket for giving priority

        System.out.println("PRINTING..");
        String s = "HellO";
        for(int j=0;j<s.length();j++){
            System.out.println(s.charAt(j));
        }

        System.out.println("REVERSING...");
        for(int i=s.length()-1;i>=0;i--){
            System.out.println(s.charAt(i));
        }
        //the above one is for printing in reverse order

        String str="";
        for(int i=s.length()-1;i>=0;i--) {
            str = str + s.charAt(i);
        }
        System.out.println(str);


        System.out.println("Trim Function ");
        String s2 = "  Hello World Hi ";
        System.out.println(s2.length());
        s2=s2.trim(); //remove trial space
        System.out.println(s2);
        System.out.println(s2.length());
        System.out.println("split function...");
        String str1[] = s2.split(" ");
        for(String st:str1){
            System.out.println(st);
        }


    }
}
