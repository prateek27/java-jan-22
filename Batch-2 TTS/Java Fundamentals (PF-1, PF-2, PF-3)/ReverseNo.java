package com.january;

public class ReverseNo {
    public static void main(String[] args) {
        int N = 100045;
        int ans = 0;
        while(N>0){
            int rem = N%10;
            ans = ans*10 + rem;
            N = N/10;
        }
        System.out.println(ans);
    }
}
