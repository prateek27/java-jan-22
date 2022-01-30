package com.jan2.recursion;

public class IncDec {

    static void dec(int n){
        //base case
        if(n==0){
            return;
        }
        //rec case
        System.out.print(n + ",");
        dec(n-1);
    }
    static void inc(int n){
        //base case
        if(n==0){
            return;
        }

        //rec case
        inc(n-1);
        System.out.print(n + ",");
    }

    public static void main(String[] args) {
        dec(5);
        System.out.println();
        inc(5);
    }
}
