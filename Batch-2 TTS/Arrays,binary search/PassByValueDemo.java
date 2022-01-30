package com.jan2.Arrays;

public class PassByValueDemo {

    static void pesaDouble(int money){
        money = money*2;
        System.out.println("In Fn "+money);
    }
    static int pesaDoubleByReturn(int money){
        money = money*2;
        System.out.println("In Fn "+money);
        return money;
    }

    public static void main(String[] args) {
        int money = 10;
        // pesaDouble(money);
        money = pesaDoubleByReturn(money);
        System.out.println("In main " + money);

    }
}
