package com.january;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        //Scanner Object
        Scanner sc = new Scanner(System.in); //bydefault reads from the keyboard input
        int P = sc.nextInt();
        float R = sc.nextFloat();
        int T = sc.nextInt();
        float SI = (P*R*T)/100.0f;
        System.out.println(SI);
    }
}
