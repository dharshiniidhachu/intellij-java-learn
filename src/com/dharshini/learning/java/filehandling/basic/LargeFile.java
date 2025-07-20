package com.dharshini.learning.java.filehandling.basic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LargeFile {

    public static void main(String[] args) {

        try{
            BufferedReader reader = new BufferedReader(new FileReader("sample.txt"));
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }

        } catch(IOException e){
            System.out.println("Error Ocurred");
            e.printStackTrace();
        }
    }
}
