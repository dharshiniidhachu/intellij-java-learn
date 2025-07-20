package com.dharshini.learning.java.filehandling.basic;

import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {

        try{
            File file = new File("Example.txt");
            if(file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            }else {
                System.out.println("File alreday exists");
            }

            System.out.println("File exists: " + file.exists());
            System.out.println("File path: " + file.getAbsolutePath());
            System.out.println("Is File Writable: " + file.canWrite());
            System.out.println("Is File Readable: " + file.canRead());

        } catch (IOException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
}
