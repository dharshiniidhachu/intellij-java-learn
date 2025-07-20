package com.dharshini.learning.java.tasks;

public class AccessingUsingThis {
    String name;
    int mark;
    String college;

    AccessingUsingThis(String name,int mark,String college) {
        this.name = name;
        this.mark = mark;
        this.college = college;

    }
    void display(){
        System.out.println(name);
        System.out.println(mark);
        System.out.println(college);
    }
    public static void main(String[] args) {
        AccessingUsingThis a = new AccessingUsingThis("Dhachu",90,"KNCET");
        a.display();

    }
}
