package com.january.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

    static void playWithArray(){
        int[] arr = {10,20,30,40,50};
        //length of the array
        System.out.println(arr.length);

        // Address (Object Reference)
        System.out.println(arr);

        //0th index element
        System.out.println(arr[0]);
        //last index element
        System.out.println(arr[arr.length-1]);

        //print all elements
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
        System.out.println();

        // Inbuilt method
        System.out.println(Arrays.toString(arr));

        //Enhanced For Loop
        System.out.println();

    }
    static void printArray(int[] arr){
        for(int x : arr){
            System.out.print(x+ ",");
        }
    }
    static int[] createArray(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //create an array using new
        int[] arr = new int[n]; //heap-> runtime allocation

        //take input N times
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        //Take input N, create a array of size N and read it
        int[] myArray = createArray();
        // You can pass array to functions
        printArray(myArray);

        // Updating the size of array-new array;
        int arr[] = new int[10];
        System.out.println(arr);
        arr  = new int[5];
        System.out.println(arr);

    }



}
