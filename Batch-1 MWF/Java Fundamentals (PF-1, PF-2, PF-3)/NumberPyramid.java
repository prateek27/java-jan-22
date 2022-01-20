package com.january;

public class NumberPyramid {

    public static void main(String[] args) {
        int N = 5;
        for(int i=1; i<=N; i++){
            //Spaces
            for(int spaces=1;spaces<=N-i; spaces++){
                System.out.print("0 ");

            }

            //Increasing No's
            int val = i;
            for(int cnt=1; cnt<=i; cnt++){
                System.out.print(val + " ");
                val++;
            }

            //Dec No's
            val = val - 2;
            for(int cnt=1; cnt<=i-1; cnt++){
                System.out.print(val + " ");
                val--;
            }
            //Zeroes
            for(int spaces=1;spaces<=N-i; spaces++){
                System.out.print("0");
                if(spaces!=N-i){
                    System.out.print(" ");
                }
            }

            //New Line
            System.out.println();
        }
    }

}
