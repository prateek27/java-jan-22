package com.january;

public class ReversePrint {

    public static void main(String[] args) {
        int N = 10000;
        while(N>0){
            System.out.print(N%10);
            N = N/10;
        }
    }
}
