package com.dharshini.learning.java.tasks;

import com.dharshini.learning.java.innerclass.StaticOuter;

public class AccessingThroughObj {
    String name;
    int mark;
    String college;
}
 class Main{
    public static void main(String[] args) {
        AccessingThroughObj a = new AccessingThroughObj();
        a.name = "Bueno";
        a.mark = 99;
        a.college = "KNCET";
        System.out.println(a.name);
        System.out.println(a.mark);
        System.out.println(a.college);
    }
}
