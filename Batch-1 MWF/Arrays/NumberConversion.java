package com.january.Arrays;

import java.util.Scanner;

public class NumberConversion {
    static int binaryToDecimal(int n){
        int ans = 0;
        int p = 1;
        while(n>0){
            int last_bit = n%10;
            ans = ans + last_bit*p;
            p = 2*p;
            n = n/10;
        }
        return ans;
    }

    static int decimalToBinary(int n){
        int p = 1;
        int sum = 0;

        while(n>0){
            int rem = n%2;
            sum = sum + rem*p;
            p = p*10;
            n = n/2;
        }
        return sum;

    }
    static int magicNo(int n){
        int p = 5; //5^1
        int sum = 0;

        while(n>0){
            int rem = n%2;
            sum = sum + rem*p;
            p = p*5;
            n = n/2;
        }
        return sum;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //System.out.println(decimalToBinary(n));
        for(int i=1; i<=n; i++) {
            // int n = sc.nextInt();
            System.out.println(magicNo(i));
        }
    }
}
