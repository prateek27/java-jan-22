package com.january.recursion;

import java.util.Scanner;


public class TowerOfHanoi {

    static void toh(int N, String source, String dest, String helper){
        //base case
        if(N==0){
            return;
        }
        //Otherwise
        toh(N-1,source,helper,dest);
        System.out.println("I am taking disk " + N  + " from "+source + " to " + dest);
        toh(N-1,helper,dest,source);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        toh(n,"A","C","B");

    }
}
