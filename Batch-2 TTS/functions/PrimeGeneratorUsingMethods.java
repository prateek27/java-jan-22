package com.jan2.functions;

import java.util.Scanner;

public class PrimeGeneratorUsingMethods {

    static boolean checkPrime(int number){
        for(int i=2; i*i<=number; i++){
            if(number%i==0){
                return false;
            }
        }
        //out of the loop, we couldn't find a divisor
        return true;
    }

    static void printPrimes(int A,int B){
        for(int i=A; i<=B; i++){
            if(checkPrime(i)){
                System.out.println(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        printPrimes(A,B);
    }
}
