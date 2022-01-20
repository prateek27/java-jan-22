package com.jan2;

public class ReverseNo {

    public static void main(String[] args) {
        int N = 1024;
        int ans = 0;
        while(N>0){
            int rem = N%10;
            ans = ans*10 + rem;
            N = N/10;
        }
        System.out.println(ans);
    }
}
