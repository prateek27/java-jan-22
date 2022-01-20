package com.january;

import java.util.Scanner;

public class StarSpacePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=1; i<=N; i++){
            // N -i spaces
            for(int spaces=1; spaces<= N-i; spaces++){
                System.out.print(" ");
            }
            // 2i - 1 stars
            for(int stars=1; stars<= 2*i -1; stars++){
                System.out.print("*");
            }
            //New Line (avoid after the last line)
            if(i<N) {
                System.out.println();
            }
        }
    }
}
