package com.jan2;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        // Calculator
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        String operator = sc.next();
        int B = sc.nextInt();

        //System.out.println(A + operator + B);
        switch (operator){
            case "+" :
                System.out.println(A+B); break;
            case "-" :
                System.out.println(A-B); break;
            case "*" :
                System.out.println(A*B); break;
            case "/" :
                System.out.println(A/B); break;
            default:
                System.out.println("Enter valid op");
        }

    }
}
