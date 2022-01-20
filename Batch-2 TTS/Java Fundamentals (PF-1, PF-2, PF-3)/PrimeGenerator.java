package com.january;

import java.util.Scanner;

public class PrimeGenerator {

    public static void main(String[] args) {
        //read input
        Scanner sc = new Scanner(System.in);
        int A,B;
        A = sc.nextInt();
        B = sc.nextInt();

        // generate the range of numbers
        for(int no=A; no<=B; no++){
            // print no if it is prime
            // Prime Checking Logic
            boolean isPrime = true;
            for(int div=2; div*div <= no; div++){
                if(no%div==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(no);
            }
        }



    }
}
