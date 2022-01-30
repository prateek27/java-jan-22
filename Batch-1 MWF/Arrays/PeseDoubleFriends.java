package com.january.Arrays;

public class PeseDoubleFriends {

    static void pesaDouble(int[] money){
        for(int i=0; i<money.length;i++){
            money[i] = 2*money[i];
        }
    }

    public static void main(String[] args) {
        int[] friendsMoney = {10,20,30};
        pesaDouble(friendsMoney);

        for(int money:friendsMoney){
            System.out.println(money);
        }

        int[] arr = null;
        System.out.println(arr);

    }


}
