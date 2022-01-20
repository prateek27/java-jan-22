package com.jan2;

import java.util.Scanner;

public class StarPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=1; i<=N; i++){
            //spaces
            for(int spaces=1;spaces<=N-i; spaces++){
                System.out.print(" ");
            }
            //stars
            for(int stars=1; stars<=2*i-1; stars++){
                System.out.print("*");
            }
            //new line
            System.out.println();
        }
    }
}
