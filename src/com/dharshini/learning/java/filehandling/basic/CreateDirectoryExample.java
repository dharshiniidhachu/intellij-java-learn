package com.dharshini.learning.java.filehandling.basic;

import java.io.File;

public class CreateDirectoryExample {

    public static void main(String[] args) {

        File directory = new File("Example Directory");

        if(directory.mkdir()){
            System.out.println("Directory created: " + directory.getName());
        } else if (directory.exists()) {
            System.out.println("Directory is already exists");
        }
        else{
            System.out.println("Failed to create directory");
        }

        if(directory.isDirectory()){

            String[] files = directory.list();
            System.out.println("File in directory");
            for (String file : files) {
                System.out.println(file);
            }
        }
    }
}
