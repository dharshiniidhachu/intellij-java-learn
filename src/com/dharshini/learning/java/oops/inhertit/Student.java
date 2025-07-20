package com.dharshini.learning.java.oops.inhertit;
//encap and inherit
class Student {
    private String name;
    public void setName(String name){
        this.name = name;
    }
    public String  getName(){
        return name;
    }
}class Exam extends Student {
    private int mark;

    public void setMark(int mark) {
        this.mark = mark;
    }
    public int getMark() {
        return mark;
    }
}class School{
    public static void main(String[] args) {
        Exam e = new Exam();
        e.setName("Dhachu");
        System.out.println("Name: " + e.getName());
        e.setMark(90);
        System.out.println("Mark: " + e.getMark());
    }
}
