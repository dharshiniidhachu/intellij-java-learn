package com.dharshini.learning.java.tasks;

public class AccessingWithoutThis {
    String name;
    int mark;
    String college;

    AccessingWithoutThis(String n,int m,String c){
        name = n;
        mark = m;
        college = c;
    }

    void display(){
        System.out.println(name);
        System.out.println(mark);
        System.out.println(college);
    }
    public static void main(String[] args) {
        AccessingWithoutThis a = new AccessingWithoutThis("Bueno",99,"KNCET");
        a.display();

    }
}
