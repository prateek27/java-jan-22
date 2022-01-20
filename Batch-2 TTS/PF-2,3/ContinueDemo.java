package com.jan2;

public class ContinueDemo {

    public static void main(String[] args) {
        int i = 1;
        while(i<=10){

            if(i%7==0){
                i++;
                continue;
            }
            System.out.println(i);
            i = i + 1;
        }
    }

}
