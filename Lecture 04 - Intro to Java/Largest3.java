package com.january;

import java.util.Scanner;

public class Largest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if (A >= B && A >= C) {
            System.out.println(A + " is largest");
        }
        else if (B >= C) {
            System.out.println(B + " is largest");
        }
        else {
            System.out.println(C + "is largest");
        }
        return; //optional

        /*
        if (A >= B && A >= C) {
            System.out.println(A + " is largest");
            return; //exit
        }
        if (B >= C) {
            System.out.println(B + " is largest");
            return;
        }
        else {
            System.out.println(C + "is largest");
            return;
        }*/
    }
}
