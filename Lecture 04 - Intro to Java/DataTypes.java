package com.january;

public class DataTypes {
    public static void main(String[] args) {
        int x = 10005689;
        long y = x;
        System.out.println(x);
        System.out.println(y);

        long a = 119919181818189L;
        int b = (int) a; //Overflow
        long c = (int) a;

        System.out.println(a);
        System.out.println(b);
    }

}
