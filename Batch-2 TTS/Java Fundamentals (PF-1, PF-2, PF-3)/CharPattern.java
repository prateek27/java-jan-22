package com.january;

public class CharPattern {

    public static void main(String[] args) {

        int N = 4;
        for(int i=1; i<=N; i++){
            char val = 'A';
            for(int cnt=1; cnt<=i; cnt++){
                System.out.print(val);
                if(cnt<i){
                    System.out.print(" ");
                }
                val++; //changing type to char from int
            }
            System.out.println();
        }
    }

}
