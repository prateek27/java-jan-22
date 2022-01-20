package com.jan2;

public class CharPattern {

    public static void main(String[] args) {
        /*char ch = 'A';
        System.out.println(ch);
        System.out.println(ch + 1);
        System.out.println((char)(ch + 1));*/
        int N = 4;

        for(int i=1; i<=N;i++){
            char val = 'A'; // 65
            //i cols in ith row
            for(int col=1; col<=i; col++){
                System.out.print(val++);
            }
            System.out.println();
        }
    }


}
