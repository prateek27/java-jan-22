package com.jan2.recursion;

import java.util.Scanner;

public class TOH {

    static int toh(int n,String src, String dest, String helper){
        if(n==0){
            return 0;
        }
        //otherwise
        int s1 = toh(n-1,src,helper,dest);
        System.out.println("Shift "+ n + "disk from "+src + " to "+dest);
        int s2 = toh(n-1,helper,dest,src);
        return s1 + s2 + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

    }
}
