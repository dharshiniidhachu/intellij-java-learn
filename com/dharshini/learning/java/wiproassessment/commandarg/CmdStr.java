package com.dharshini.learning.java.wiproassessment.commandarg;

public class CmdStr {
    public static void main(String[] args) {
        if(args.length==1) {
            System.out.println("Welcome " + args[0]);
        }else {
            System.out.println("Provide one argument");
        }
    }
}
