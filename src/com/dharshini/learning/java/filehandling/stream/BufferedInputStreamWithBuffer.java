package com.dharshini.learning.java.filehandling.stream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamWithBuffer {

    public static void main(String[] args) {

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("Example.txt"))) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            while((bytesRead = bis.read(buffer)) != 1) {
                System.out.println(new String(buffer,0,bytesRead));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
