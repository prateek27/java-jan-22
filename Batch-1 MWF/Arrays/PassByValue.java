package com.january.Arrays;

public class PassByValue {

    static int pesaDouble(int money){
        money = 2*money;
        System.out.println("inside func " +  money);
        return money;
    }
    static void pesaDoubleOne(int money){
        money = 2*money;
        System.out.println("inside func " +  money);

    }
    public static void main(String[] args) {
        int money = 10;
        money = pesaDouble(money);
        System.out.println("inside money " + money);
    }
}
