package com.dharshini.learning.java.filehandling.basic;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFileExample {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("Example.txt");
            writer.write("Hello, this is a sample file.\n");
            writer.write("Java file handling is easy!\n");
            writer.write("Hey I am Dharshini.\n");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        }catch (IOException e){
            System.out.println("An Error Occured.");
            e.printStackTrace();
        }
    }
}
