package com.jan2.stringsdemo;

import java.util.Scanner;

public class StringPerformanceComp {
    //compare the time for n additions to string vs string builder
    static void addToStringBuilder(int n){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            sb.append((char)(i));
        }
    }

    static void addToString(int n){
        String s = "";
        for(int i=0; i<n;i++){
            s = s + (char)(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long start = System.currentTimeMillis();
        addToStringBuilder(n);
        long end = System.currentTimeMillis();
        System.out.println("String builder took " + (end - start));

        start = System.currentTimeMillis();
        addToString(n);
        end = System.currentTimeMillis();
        System.out.println("String  took " + (end - start));

        /*
        String s = "hello";
        String x = "hello";
        System.out.println(s.hashCode() + " , " + x.hashCode());
        */
    }
}
