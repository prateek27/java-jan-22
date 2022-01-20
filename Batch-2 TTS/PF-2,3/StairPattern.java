package com.jan2;

public class StairPattern {
    public static void main(String[] args) {

        int N = 4;
        int val = 1;
        for(int i=1; i<=N;i++){
            //inc numbers
            for(int col=1; col<=i; col++){
                System.out.print(val++);
            }
            //new line
            System.out.println();
        }

    }
}
