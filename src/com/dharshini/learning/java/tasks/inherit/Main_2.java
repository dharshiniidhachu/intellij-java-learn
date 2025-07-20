package com.dharshini.learning.java.tasks.inherit;
class Sports{
    void startGame(){
        System.out.println("I love Sports...");
    }
}
class TeamSport extends Sports{
    void teamSize(){
        System.out.println("Team is best...");
    }
}
class Soccer extends TeamSport{
    void fieldSize(){
        System.out.println("Soccer plays...");
    }
}
class Shuttle extends Sports{
    void batType(){
        System.out.println("Shuttle plays...");

    }
}
public class Main_2 {
}
