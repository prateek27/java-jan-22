package com.january.functions;

import java.util.Scanner;

public class FunctionsDemo {
    public static void sayHi(String person){
        System.out.println("Hello " + person);
        return;
    }

    // Function has a return value
    public static int areaOfRectangle(int L,int B){
        int area = L*B;
        return area;
    }

    // Computes the factorial of a number
    public static int factorial(int number){
        int ans = 1;
        for(int i=1; i<=number; i++){
            ans = ans*i;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("In Main");
        sayHi("Rahul"); //Function Call - 1
        sayHi("Ruchika"); // Function Call - 2
        System.out.println(areaOfRectangle(5,4));
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        System.out.println(factorial(no));

    }

}
