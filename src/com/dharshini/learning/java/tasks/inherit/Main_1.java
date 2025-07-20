package com.dharshini.learning.java.tasks.inherit;
class Sport{
    void play(){
        System.out.println("Playing...");
    }
}
class Football extends Sport{
    @Override
    void play() {
        super.play();
        System.out.println("Football plays...");
    }
}
class Tennis extends Sport{
    @Override
    void play() {
        super.play();
        System.out.println("Tennis plays...");
    }
}

public class Main_1 {
    public static void main(String[] args) {
        Tennis t = new Tennis();
        t.play();

    }
}
