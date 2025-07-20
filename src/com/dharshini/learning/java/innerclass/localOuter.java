package com.dharshini.learning.java.innerclass;

class localOuter {

    void outerMethod(){

        int n = 42;

        class LocalInner {
            void display(){
                System.out.println("Local Inner Class: " + n);
            }
        }

        LocalInner a = new LocalInner();
        a.display();
    }

    public static void main(String[] args) {
        localOuter outer = new localOuter();
        outer.outerMethod();
    }
}
