package com.january;

public class BreakDemo {

    public static void main(String[] args) {

        int cal = 0;
        int gf_calls_up = 40;
        int mom_calls_up = 30;

        while(cal<=100){
            System.out.println("Running on treadmill" + cal);
            if(cal==mom_calls_up){
                return;
            }

            if(cal==gf_calls_up){
                break;
            }
            cal = cal + 5;
        }
        System.out.println("time for dinner ");
    }
}
