package com.january;

import java.util.Scanner;

public class DoWhileDemo {

    // Take input a stream of numbers, stop processing input
    // when the sum of all inputs so far becomes negative
    // print the sum

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum;
        for(sum=0; sum>=0;sum = sum + sc.nextInt()){}
        System.out.println("Loop" + sum);

        /*
        int sum=0;
        while(sum>=0){
            sum = sum + sc.nextInt();
        }
        System.out.println(sum);
        */



        /*
        int num = sc.nextInt();
        int sum = num;

        while(sum>=0){
            num = sc.nextInt();
            sum = sum + num;
        }
        System.out.println(sum);
        */

        /*
        int sum = 0;

        do{
            int num = sc.nextInt();
            sum = sum + num;
        }
        while(sum>=0);
        System.out.println(sum);

         */
    }


}
