package com.jan2.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDemo {

    static void printArray(int[] arr){
        // Print all the elements of the array
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    static void playWithArray(){
        int[] arr = {1,3,5,6,7,8};
        System.out.println(arr.length);
        printArray(arr);
    }

    static int[] createArray(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        //take input all the values
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(arr);
        return arr;
    }
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int[] swapClone(int[] arr,int i,int j){
        int[] arrCopy = arr.clone();
        //make the copy of the array
        // swapping logic goes here...

        return arrCopy;
    }

    public static void main(String[] args) {
        //Pass by Value & Pass by Reference (done)
        // How to create a variable size array
        int[] myArr = createArray();
        //myArr = null;
        System.out.println(myArr);
        //print-1 (for loop -> more control over indices)
        printArray(myArr);

        //print-2
        System.out.println(Arrays.toString(myArr));
        //print-3 enhanced for loop (for each loop)
        for(int x:myArr){  //iterates over the values
            System.out.print(x+",");
        }
        swap(myArr,2,4);
        System.out.println(Arrays.toString(myArr));
    }
}
