package com.jan2.twoDArrays;

import java.util.Arrays;
import java.util.Scanner;

public class twoDArrayDemo {

    // 1 Hardcoded Array
    // Fixed columns
    // Jagged Array (Variable Cols)
    static void display2DArray(int[][] arr){
        for(int i=0; i<arr.length;i++){
            // how to iterate over inner array
            System.out.print(Arrays.toString(arr[i]));
            /*
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            */

            /*
            for(int x : arr[i]){
                System.out.print(x+" ");
            }
             */
            System.out.println();
        }
    }

    static void hardCodedArray(){
        int[][] arr = {{1,2,3,4},{5,6},{7,8,9}};
        System.out.println(arr); // address of 2d array
        System.out.println(arr[0]); // address of 0th array
        System.out.println(arr[1]); // address of 1st array
        System.out.println(arr[0][0]); //1
        System.out.println(arr.length); //3
        System.out.println(arr[0].length); //4
        display2DArray(arr);
    }
    static int[][] create2DArray(int rows,int cols){
        int[][] arr = new int[rows][cols];
        Scanner sc = new Scanner(System.in);
        //Take Elements as Input from the user
        for(int i=0; i<rows; i++){
            for(int j=0;j<cols;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    // Jagged Cols (Take Input for each row)
    static int[][] createJaggedArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int rows = sc.nextInt();

        int[][] arr = new int[rows][];

        for(int i=0;i<rows;i++){
            System.out.println("Tell me cols in "+i+" row");
            int cols = sc.nextInt();
            //create the memory for ith row
            arr[i] = new int[cols];
            // read the values for ith row
            for(int j=0; j<cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    static void wavePrint(int[][] arr){

        //Rows & Cols
        int rows = arr.length;
        int cols = arr[0].length; //cols are same for every row

        //need to loop for columns
        for(int c=0; c<cols; c++){
            //check for c is odd or even
            if(c%2==0){
                //top to bottom
                for(int r=0; r<rows;r++){
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
        Scanner sc = new Scanner(System.in);
         int rows = sc.nextInt();
         int cols = sc.nextInt();
         int[][] arr = create2DArray(rows,cols);
         wavePrint(arr);
        //int[][] arr = createJaggedArray();
        //display2DArray(arr);
        //display2DArray(arr);
    }
}
