package com.january.oops;

import java.util.Scanner;

public class GameLauncher {
    public static void main(String[] args) {
        Game guessGame1 = new Game("Amit", "Rahul","Shruti"); //Game Constructor-1
        guessGame1.launch(); // Game Launch - 2
        Game guessGame2 = new Game("Sagar", "Neel","Shubham");
        guessGame2.launch();
    }
}


//Another Class (Game Logic)
class Game{
    Player p1; //
    Player p2;
    Player p3;
    int expectedGuess;

    Game(String name1, String name2, String name3){
        p1 = new Player(name1);
        p2 = new Player(name2);
        p3 = new Player(name3);
    }

    boolean checkWinner(){
        if(p1.number==expectedGuess){
            System.out.println(p1.name + "wins");
            return true;
        }
        else if(p2.number==expectedGuess){
            System.out.println(p2.name + "wins");
            return true;
        }
        else if(p3.number==expectedGuess){
            System.out.println(p3.name + "wins");
            return true;
        }
        return false;
    }

    void launch(){
        //do we have a winner
        expectedGuess = (int)(Math.random() * 10);
        System.out.println("Guess expected is " + expectedGuess);
        while(true){
            p1.guess();
            p2.guess();
            p3.guess();
            //if we we get winner we should stop
            if(checkWinner()==true){
                break;
            }
            System.out.println("Try again");
        }
    }
}


// Another Class (Player)
class Player{
    String name;
    int number;
    int health;

    static Scanner sc = new Scanner(System.in);

    Player(String name){
        this.name = name;
    }

    void guess(){
        // take input from the user to make a guess
        number =  (int)(Math.random() * 10) ;//sc.nextInt();
        System.out.println(name + " guessed a number " + number);
    }
}