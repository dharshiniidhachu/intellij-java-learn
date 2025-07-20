package com.dharshini.learning.java.system;

public class ExecuteCommandExample {

    public static void main(String[] args) {
        try{
            Runtime runtime = Runtime.getRuntime();
            Process process = runtime.exec("notepad");

            System.out.println("Notepad Opened");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
