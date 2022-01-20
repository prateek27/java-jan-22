package com.january;

public class StairPatternSImple {
    public static void main(String[] args) {
        int N = 4;
        int val = 1;

        for(int i=1; i<=N; i++){
            for(int col=1; col<=i; col++){
                System.out.print(val + " ");
                val++;
            }
            System.out.println();
        }
        /*
        Multiline
        comment
         */

        /*
        for(int i=1; i<=N; i++){
            for(int col=1; col<=i; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
         */
    }

}
