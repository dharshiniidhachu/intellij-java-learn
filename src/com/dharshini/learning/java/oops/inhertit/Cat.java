package com.dharshini.learning.java.oops.inhertit;

 class Cat extends Animal {
     public Cat(String name) {
         super(name);
     }

     @Override
     public void makeSound() {

        System.out.println(name + "meows");
     }


     public void doCatch(){
         System.out.println(name + "catches a rat");
     }
 }
