package com.dharshini.learning.java.test;

public class ChunkTest {

    public static void main(String[] args) {

        int totalSize = 600;
        int chunkSize = (int) Math.ceil((double) totalSize/6);
        for(int i = 0; i<6 ; i++) {

            int start = i * chunkSize;
            int end = Math.min(start+chunkSize,totalSize);
            if(start<totalSize) {
                System.out.println("Start : " + start + " End : " + end);
            }
        }
    }
}
