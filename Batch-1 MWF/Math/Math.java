package com.january;

import java.util.Scanner;

public class Math {
    static int multiply(int a,int n){
        if(n==0){
            return a;
        }
        return a + multiply(a,n-1);
    }

    static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        //System.out.println(multiply(a,b));
        System.out.println(gcd(a,b));
}
}
