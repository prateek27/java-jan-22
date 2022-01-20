package com.january.recursion;

public class FibonacciDemo {

    static int fibonacci(int n){
        //base case
        if(n==0 || n==1 ){
            return n;
        }
        //recursive case
        int f1 = fibonacci(n-1);
        int f2 = fibonacci(n-2);
        int ans = f1 + f2;
        return ans;
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(fibonacci(6));
    }
}
