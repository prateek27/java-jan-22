package com.jan2.functions;

import java.util.Scanner;

public class FunctionsDemo {

    //Method sayHi
    public static void sayHi(String name){
        System.out.println("Hi " + name);
    }

    // calc theArea
    public static float areaOfCircle(int radius){
        float area = (float)Math.PI*radius*radius;
        return area;
    }

    public static void main(String[] args) {
        sayHi("Malay"); //Function Call
        sayHi("Rishab");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        sayHi(name);
        float output = areaOfCircle(5);
        System.out.println(output);
        System.out.println(areaOfCircle(6));
    }
}
