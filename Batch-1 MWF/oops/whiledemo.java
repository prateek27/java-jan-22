package com.january.oops;

public class whiledemo {

    public static void main(String[] args) {

        for(int i=1; i<=4; i++){
            System.out.println(Math.random());
        }

        while(true){
            int guess = (int)(Math.random()*10);
            System.out.println(guess);
            if(guess==3){
                break;
            }

        }
    }
}
