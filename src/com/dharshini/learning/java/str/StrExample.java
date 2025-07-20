package com.dharshini.learning.java.str;

public class StrExample {
    public static void main(String[] args) {
        String s1 = "listen";
        s1 = s1.concat(" to me");
        System.out.println("After Concatenation: "+s1);
        System.out.println(s1.indexOf('a'));
        System.out.println(s1.lastIndexOf('a'));

        System.out.println("length of vowels in a string");
        String s2 = "listen to me";
        s2= s2.replaceAll("[^AEIOUaeiou]","");//removing spaces
        System.out.println(s2.length());

        System.out.println("Length of vowels in a String method2");
        String st = "listen To ME";
        System.out.println(st);
        int c1 = s1.length();
        s1 = s1.replaceAll("[AEIOUaeiou]","");
        System.out.println(s1.length());
        int c2 = s1.length();
        System.out.println(c1-c2);

        System.out.println("SUBSTRING METHOD");
        String s3 = "listen To ME";
        s3 = s3.substring(7,9);
        System.out.println(s3);

        System.out.println("JOIN METHOD");
        String st1[] = {"Hello","Team"};
        String st2 = String.join(" ",st1);
        System.out.println(st2);





    }
}
