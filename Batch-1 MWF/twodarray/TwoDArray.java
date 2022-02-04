package com.january.twodarray;

import java.util.Scanner;

public class TwoDArray {
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

    // Take a 2D Array as Input (fixed cols)

    static int[][] create2DArray(){
        System.out.println("Enter no of rows & columns");
        int rows,cols;
        Scanner sc = new Scanner(System.in);
        rows = sc.nextInt();
        cols = sc.nextInt();

        //Allocation & Create the Array
        int[][] arr = new int[rows][cols]; //tic tac toe 3,3

        //next step - read the data
        for(int i=0; i<rows; i++){
            //lets read all cols of this row
            for(int j=0; j<cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("In fn " + arr);
        return arr;
    }
    static int[][] create2DArrayWithVariableCols(){
        System.out.println("Enter no of rows");
        int rows,cols;
        Scanner sc = new Scanner(System.in);
        rows = sc.nextInt();

        //Allocation & Create the Array
        int[][] arr = new int[rows][]; //tic tac toe 3,3

        //next step - read the data
        for(int i=0; i<rows; i++){
            //let's create the inner array
            System.out.println("Enter col in current row");
            int cols_in_current_row = sc.nextInt();
            //update
            arr[i] = new int[cols_in_current_row];

            //lets read all cols of this row
            for(int j=0; j<cols_in_current_row; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("In fn " + arr);
        return arr;
    }
    static void hardCodedArrayDemo(){
        int[][] arr = {{10,20,30},
                {40,50,60,70},
                {80,90}};
        //Show you
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[0][0]);

        //print the linear array
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + "has " + arr[i].length + "elements");
        }
    }

    static void displayWavePrint(int[][] arr){

        //fixed no of columns
        int cols = arr[0].length;
        int rows = arr.length;

        //columns
        for(int c=0; c<cols; c++){
                if(c%2==0){
                    //top to bottom
                    for(int r=0; r<rows; r++){
                        System.out.print(arr[r][c] + " ");
                    }
                }
                else{
                    //bottom to top
                    for(int r=rows-1; r>=0; r--){
                        System.out.print(arr[r][c] + " ");
                    }
                }
        }
    }


    public static void main(String[] args) {
        // Hardcoded Array
        // Jagged Array (Variable No of columns)
        // int[][] arr = create2DArrayWithVariableCols();
        int[][] arr = create2DArray();

        // arr[1] = null;
        //System.out.println("Address in Main " + arr);
        displayArray(arr);
        System.out.println();
        displayWavePrint(arr);
    }
}
