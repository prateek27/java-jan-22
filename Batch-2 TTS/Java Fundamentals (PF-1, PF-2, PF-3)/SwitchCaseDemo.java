package com.january;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Build a very simple calculator
        // No1 + Operation + No2
        // 5 + 3 = 8
        int A = sc.nextInt();
        String operator = sc.next();
        int B = sc.nextInt();

        switch(operator){
            case "+" :
                System.out.println(A+B);
                break;
            case "-":
                System.out.println(A-B);
                break;
            case "*":
                System.out.println(A*B);
                break;
            case "/":
                System.out.println(A/B);
                break;
            default:
                System.out.println("Enter valid operator");
        }

        System.out.println("End of calculation");

    }
}
