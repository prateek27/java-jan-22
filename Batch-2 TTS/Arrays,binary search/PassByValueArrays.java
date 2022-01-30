package com.jan2.Arrays;

import java.util.Arrays;

public class PassByValueArrays {

    static void pesaDouble(int[] money){
        for(int i=0; i<money.length; i++){
            money[i] = 2*money[i];
        }
    }
    public static void main(String[] args) {
        int[] friends_money = {10,20,30};
        System.out.println("in Main");
        //another way printing the arrays
        pesaDouble(friends_money);
        System.out.println(Arrays.toString(friends_money));
    }
}
