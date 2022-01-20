package com.jan2;

import java.util.Scanner;

public class DoWhileDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0; //or sc.nextInt()
        for(  ;sum>=0; sum += sc.nextInt()){}
        System.out.println(sum);

        /*
        int sum = sc.nextInt();
        while(sum>=0){
            int num = sc.nextInt();
            sum = sum + num;
        }

         */


        /*
        int sum = 0;
        do{
            int num = sc.nextInt();
            sum = sum + num;
        }
        while(sum>=0);
        System.out.println("final sum "+sum);
         */
    }
}
