package com.dharshini.learning.java.wiproassessment.clsandobj;

public class Box {
    int width;
    int height;
    int depth;

    Box(int w,int h,int d){
        this.width= w;
        this.height = h;
        this.depth = d;
    }
    void volume(){
        int v = width*height*depth;
        System.out.println(v);
    }

    public static void main(String[] args) {
        Box b = new Box(1,2,3);
        b.volume();

    }




}
