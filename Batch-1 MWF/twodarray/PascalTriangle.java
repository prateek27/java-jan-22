package com.january.twodarray;



public class PascalTriangle {
    static void displayArray(int[][] arr){
        //Print
        for(int i=0; i<arr.length; i++){
            int cols_in_current_row = arr[i].length;
            for(int j=0; j<cols_in_current_row; j++){
                System.out.print(arr[i][j] + " ");
            }
            //new line after every row
            System.out.println();
        }
    }

    static int[][] pascalsTriangle(int n){

        int[][] arr = new int[n+1][];

        for(int i=0; i<=n;i++){
            //create each rows with i+1 columns
            arr[i] = new int[i+1];


            //fill the values in each of the columns
            arr[i][0] = arr[i][i] = 1;
            //middle cols
            for(int j=1; j<=i-1; j++){
                arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
            }

        }
        return arr;
    }

    public static void main(String[] args) {
        int n = 4; //print the bino coefficients upto 4
        int[][] arr = pascalsTriangle(n);
        displayArray(arr);
    }
}
