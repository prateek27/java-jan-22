package com.january;

import java.util.Scanner;

public class LargestOfN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int largestTillNow = Integer.MIN_VALUE;
        System.out.println(largestTillNow);

        int i=1;
        int val;
        while(i<=N){
            //Read the next no and compare with largest
            val = sc.nextInt();
            System.out.println("Reading no " + val + "and updating");
            if(val > largestTillNow){
                largestTillNow = val;
            }
            i = i + 1;
        }
        System.out.println(largestTillNow);
    }



}
