package com.jan2;

public class IncDecOps {
    public static void main(String[] args) {

        int x = 10;
        int y = x++;
        System.out.println(x + "," + y);
        y = ++x;  //preinc
        System.out.println(x + "," + y);
    }
}
