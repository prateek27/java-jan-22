package com.jan2;

import java.util.Scanner;

public class PrimeCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        for(int no=A; no<=B;no++) {
            boolean isPrime = true;
            //Handle 1 as special case
            for (int i = 2; i * i <= no; i++) {
                if (no % i == 0) {
                    //as soon as I get a divisor
                    isPrime = false;
                    break;
                }
            }
            //Out of loop
            if (isPrime) {
                System.out.println(no);
            }
        }


    }

}
