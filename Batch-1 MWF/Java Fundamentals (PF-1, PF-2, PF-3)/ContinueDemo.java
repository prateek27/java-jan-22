package com.january;

public class ContinueDemo {
    public static void main(String[] args) {

        int i = 1;
        while(i<=10){
            System.out.println(i);
            if(i%5==0){
                i = i + 2;
                continue;
            }
            i = i + 1;
        }
    }
}
