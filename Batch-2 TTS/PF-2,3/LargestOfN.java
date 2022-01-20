package com.jan2;

import java.util.Scanner;

public class LargestOfN {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 1;
        int current;
        int largest = Integer.MIN_VALUE;

        while(i<=N){
            // Read the current value and compare it with the largest so far
            current = sc.nextInt();
            // System.out.println("Reading number "+current + "and comparing with "+largest);
            if(current>largest){
                largest = current;
            }
            // OR largest = Math.max(current,largest);
            i = i + 1;
        }

        System.out.println(largest);
    }

}
