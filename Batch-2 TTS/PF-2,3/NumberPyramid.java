package com.jan2;

public class NumberPyramid {
    public static void main(String[] args) {

        int N = 5;
        for(int i=1; i<=N; i++){
            //spaces
            for(int spaces=1; spaces<=N-i; spaces++){
                System.out.print("0 ");
            }

            //inc nos
            int val = i;
            for(int cnt=1; cnt<=i; cnt++){
                System.out.print(val +" ");
                val++;
            }

            //dec no's
            val = val - 2;
            for(int cnt=1; cnt<=i-1; cnt++){
                System.out.print(val + " ");
                val--;
            }
            //zeroes again
            for(int spaces=1; spaces<=N-i; spaces++){
                System.out.print("0");
                if(spaces<N-i){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}
