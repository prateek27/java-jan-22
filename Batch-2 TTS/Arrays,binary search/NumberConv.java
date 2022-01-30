package com.jan2.Arrays;

import java.util.Scanner;

public class NumberConv {

    static int decimalToBinary(int n){
        int ans = 0;
        int p = 1;
        while(n>0){
            int rem = n%2;
            ans = ans + rem*p;
            p = p*10;
            n = n/2;
        }
        return ans;
    }
    static int magicNo(int n){
        int ans = 0;
        int p = 5;
        while(n>0){
            int rem = n%2;
            ans = ans + rem*p;
            p = p*5;
            n = n/2;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(decimalToBinary(n));
        for(int i=1; i<=8; i++){
            System.out.println(magicNo(i));
        }
    }
}
