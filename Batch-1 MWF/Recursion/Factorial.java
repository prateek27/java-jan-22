package com.january.recursion;

public class Factorial {

    static int factorial(int n){
        // base case
        if(n==0){
            return 1;
        }

        // recursive case
        int ans = n * factorial(n-1);
        return ans;
    }


    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }

}
