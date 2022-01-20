package com.january;

public class SumOfDigits {
    public static void main(String[] args) {
        int N = 12045;
        int sum=0;
        for(;N>0;N/=10){
            sum+=N%10;
        }
        System.out.println(sum);
        /*
        int sum = 0;
        while(N>0){
            int rem = N%10;
            sum = sum + rem;
            N = N/10;
        }*/
        System.out.println(sum);
    }
}
