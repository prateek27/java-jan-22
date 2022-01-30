package com.jan2.recursion;

public class FactorialRec {

    static int factorial(int n){
        //Base Case
        if(n==0){
            return 1;
        }
        //Rec Case
        int ans = n * factorial(n-1);
        return ans;
    }
    static int multiply(int a,int n){
        //base case
        if(n==0){
            return 0;
        }
        return a + multiply(a,n-1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(5));
        System.out.println(multiply(5,7));
    }
}
