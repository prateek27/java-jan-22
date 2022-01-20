package com.jan2;

public class WhileDemo {

    public static void main(String[] args) {

        int cal = 1;
        while(cal<=10){
            System.out.println("run a step" + (cal));
            cal = cal + 1;
        }
        System.out.println("after loop " + cal);
    }


}
