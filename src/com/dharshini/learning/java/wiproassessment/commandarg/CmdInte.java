package com.dharshini.learning.java.wiproassessment.commandarg;

public class CmdInte {
    public static void main(String[] args) {
        if(args.length==2) {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println(a+b);
        }else {
            System.out.println("provide valid 2 args");
        }
    }
}
