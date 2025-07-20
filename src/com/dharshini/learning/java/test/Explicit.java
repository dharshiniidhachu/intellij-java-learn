package com.dharshini.learning.java.test;

public class Explicit {
    int j;
    public static void main(String[] args) {
        double d = 100.99;
        int num = (int) d;
        System.out.println("Double : " +d);
        System.out.println("Integer : " + num);
        Explicit obj = new Explicit();
        int out = obj.castStringToInt("450");
        System.out.println(out);
        obj.checkLocalVariable();
    }
    private int castStringToInt(String intvalue)
    {
        int retuval = Integer.parseInt(intvalue);
        return retuval;
    }
    private void checkLocalVariable(){
        int i=0 ;
        System.out.println(j);
        System.out.println(i);
    }
}
