package com.dharshini.learning.java.filehandling.basic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingLargeFile {

        public static void main(String[] args) {


            BufferedReader reader = null;
            try {
                reader = new BufferedReader(new FileReader("sample.txt"));
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.out.println("ERROR OCCURRED");
                e.printStackTrace();

            } finally {
                if (reader != null) {
                    try {
                        reader.close();
                        System.out.println("file closed");
                    } catch (IOException e) {
                        System.out.println("ERROR OCCURED");
                        e.printStackTrace();
                    }
                }
            }
        }
    }
