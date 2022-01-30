package com.jan2.Arrays;

import java.util.Scanner;

public class SquareRoot {

    static int sqRootLinear(int n){

        int i = 0;
        //linear search -> iterations? RootN Steps
        while(i*i <=n){
            i++;
        }
        return i - 1;
    }

    static int sqRootBinarySearch(int n){
        int s = 0;
        int e = n;
        int ans = 0;

        while(s<=e){
            int mid = (s+e)/2;
            if(mid*mid<=n){
                ans = mid;
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
        }
        return ans;
    }

    static double sqRootPrecision(int n,int p){
        int s = 0;
        int e = n;
        double ans = 0;

        while(s<=e){
            int mid = (s+e)/2;
            if(mid*mid<=n){
                ans = mid;
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
        }
        //Linear Search for p places
        double inc = 0.1;
        for(int places=1;places<=p;places++) {
            while (ans * ans <= n) {
                ans = ans + inc;
            }
            ans = ans - inc;
            inc = inc/10;
        }
        return ans;
    }


    public static void main(String[] args) {
        System.out.println(sqRootLinear(30));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //System.out.println(sqRootBinarySearch(n));
        double ans = sqRootPrecision(n,3);
        System.out.println(String.format("%.3f",ans));
    }
}
