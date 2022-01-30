package com.jan2.Arrays;

import java.util.Scanner;

public class ArraysSearch {
    // Return the first occ
    static int linearSearch(int[] arr,int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                return i;
            }
        }
        //out of the loop
        return -1;
    }
    // Print all the occ
    static void linearSearchPrintAll(int[] arr,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.print(i+",");
            }
        }
        return;
    }

    // Return all the occ
    static int[] linearSearchFindAll(int[] arr,int key){

        int[] output = new int[arr.length+1];
        int j = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                output[j] = i;
                j = j + 1;
            }
        }
        output[j] = -1;
        return output;
    }

    // Binary Search Basic
    static int binarySearch(int[] arr,int key){
        int s = 0;
        int e = arr.length - 1;

        while(s<=e){
            int mid = (s+e)/2;
            if(arr[mid] > key){
                e = mid - 1;
            }
            else if(arr[mid]<key){
                s = mid + 1;
            }
            else{
                //equal
                return mid;
            }
        }
        // happens if s > e
        return -1;
    }

    static int binarySearchFirstOcc(int[] arr,int key){
        // Try it yourself.
        int s = 0;
        int e = arr.length - 1;
        int ans = -1; //assume that there is no such occ

        while(s<=e){
            int mid = (s+e)/2;
            if(arr[mid]>key){
                e = mid - 1;
            }
            else if(arr[mid] < key){
                s = mid + 1;
            }
            else{
                //equal
                ans = mid;
                // search left bcoz there may be occ on the left
                e = mid - 1;
            }
        }
        return ans;
    }
    static int binarySearchLastOcc(int[] arr,int key){
        // Try it yourself.
        int s = 0;
        int e = arr.length - 1;
        int ans = -1; //assume that there is no such occ

        while(s<=e){
            int mid = (s+e)/2;
            if(arr[mid]>key){
                e = mid - 1;
            }
            else if(arr[mid] < key){
                s = mid + 1;
            }
            else{
                //equal
                ans = mid;
                // search right bcoz there may be occ on the right
                s = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,8,7,6,7,7,2,7};
        int sorted_arr[] = {1,3,5,7,7,7,7,16,20,24,28};
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        System.out.println(binarySearchFirstOcc(sorted_arr,key));
        System.out.println(binarySearchLastOcc(sorted_arr,key));
        /*int[] occ = linearSearchFindAll(arr,key);
        int idx = 0;
        while(occ[idx]!=-1){
            System.out.println(occ[idx]);
            idx++;
        }*/

        //linearSearchPrintAll(arr,key);
        /*
        int idx = linearSearch(arr,key);
        if(idx==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Index " + idx);
        }

         */
    }
}
