package com.jan2;

public class BreakDemo {
    public static void main(String[] args) {

        int cal = 0;
        int gf_calls_up = 40;
        int mom_calls_up = 30;

        while(cal<=100){
            System.out.println("Running step & cal " + cal);
            if(cal==mom_calls_up)
            {
                return; //out of the method - main
            }

            if(cal==gf_calls_up){
                break; // out of the loop - while
            }
            cal = cal + 5;
        }
        System.out.println("Go for a dinner");
    }
}
