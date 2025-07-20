package com.dharshini.learning.java.college;

import java.util.Scanner;

 class Students {
     String name;
     int mark;
     String college;

     public Students(String name, int mark, String college) {
         this.name = name;
         this.mark = mark;
         this.college = college;
     }

     public static void main(String[] args) {

        Students s1 = new Students("Dhachu",80,"KNCET");
        System.out.println(s1.name);
         System.out.println(s1.mark);
         System.out.println(s1.college);


    }

}
