package com.jan2.twoDArrays;

import java.util.Arrays;

public class PascalsTriangle {

    static void display2DArray(int[][] arr){
        for(int i=0; i<arr.length;i++){
            // how to iterate over inner array
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] pascalsTriangle(int n){

        int[][] arr = new int[n][];

        //Loop
        for(int i=0; i<n; i++){
            //creating 1-d arrays for individual rows
            int cols = i + 1;
            arr[i] = new int[cols];
            //fill with values (first and last element)
            arr[i][0] = arr[i][i] = 1;
            // formula for middle elements
            for(int j=1; j<=i-1; j++){
                arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] triangle = pascalsTriangle(6);
        display2DArray(triangle);

    }
}
