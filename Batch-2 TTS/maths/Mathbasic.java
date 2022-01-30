package com.jan2.maths;

import java.util.Scanner;

public class Mathbasic {
    static boolean isPrime(int n,int i){
        if(i*i>n){
            return true;
        }
        if(n%i==0){
            return false;
        }
        return isPrime(n,i+1);
    }
    static long binaryToDecimal(long n){
        long p = 1;
        long ans = 0;
        while(n>0){
            long last_digit = n%10;
            ans = ans + last_digit*p;
            p = p*2;
            n = n/10;
        }
        return ans;
    }

    static int binaryToDecimalRec(int n){
        //base case
        if(n==0){
          return 0;
        }
        int myWork =  n%10;
        int recWork = binaryToDecimalRec(n/10);
        int ans = 2*recWork + myWork;
        return ans;
    }

    static int toh(int n){
        if(n==0){
            return 0;
        }
        return toh(n-1)*2 + 1;
        // instead of writing toh(n-1) + 1 + toh(n-1);
    }

    static int gcd(int A,int B){
        if(A==0){
            return B;
        }
        return gcd(B%A, A);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(gcd(A,B));
        //System.out.println(isPrime(n,2));
        System.out.println(binaryToDecimal(10000000000L));
        // System.out.println(toh(5));

    }

}
