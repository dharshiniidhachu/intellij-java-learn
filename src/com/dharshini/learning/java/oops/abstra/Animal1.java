package com.dharshini.learning.java.oops.abstra;

abstract class Animal1 {
        abstract void sound();
        void sleep(){
            System.out.println("Animal sleeps");
        }

}
class cat extends Animal1{
    @Override
    void sound() {
        System.out.println("cat meows");
    }
    void sleep() {
        super.sleep();
        System.out.println("cat sleeps");
        this.sound();  // this and super can be used within the class...
    }
}
class Main{
    public static void main(String[] args) {
        Animal1 a = new cat();
        a.sleep();
    }
}
