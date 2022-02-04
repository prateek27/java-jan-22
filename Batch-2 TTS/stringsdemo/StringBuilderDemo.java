package com.jan2.stringsdemo;

import java.util.Scanner;

public class StringBuilderDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // String s = sc.nextLine(); //Hello

        StringBuilder sb = new StringBuilder("Hello");
        sb.ensureCapacity(1000);
        System.out.println("Length :"+sb.length() + "Capacity "+sb.capacity());
        sb.append('x'); //very fast
        sb.insert(1,"iiiii");

        System.out.println("New Length :"+sb.length() + "New Capacity "+sb.capacity());
        System.out.println(sb);

        //finally convert your object into a string object
        String obj = sb.toString();
        System.out.println(obj);
    }
}
