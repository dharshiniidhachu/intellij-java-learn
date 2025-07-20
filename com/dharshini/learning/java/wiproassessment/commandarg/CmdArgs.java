package com.dharshini.learning.java.wiproassessment.commandarg;

public class CmdArgs {
    public static void main(String[] args) {
        if(args.length==2) {
            System.out.println(args[0] + " Technologies " +args[1]);
        }else {
            System.out.println("Pass two arguments");
        }

    }
}
