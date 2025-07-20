package com.dharshini.learning.java.wiproassessment.inheritan;

 class CollegeStudent extends  Student {
     String clgName;
     int yr;

     public CollegeStudent(String name, String dob, int id, String clgName, int yr) {
         super(name, dob, id);
         this.clgName = clgName;
         this.yr = yr;
     }

     void displayCollegeStudent(){
         System.out.println(clgName);
         System.out.println(yr);
     }
 }
