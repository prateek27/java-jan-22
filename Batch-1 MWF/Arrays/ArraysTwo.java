package com.january.Arrays;

import java.util.Scanner;

public class ArraysTwo {

    //return the idx of x in the array, if not present -1
    static int linearSearch(int[] arr,int x){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                return i;
            }
        }
        //out of the loop
        return arr.length;
    }
    // multiple repeating occ of key element
    static void linearSearchAll(int[] arr,int x){

        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                System.out.print(i + ",");
            }
        }
    }
    //think ...and build
    static int[] linearSearchAllReturn(int[] arr,int x){
        int[] output = new int[arr.length + 1];
        int j = 0;

        for(int i=0; i<arr.length;i++){
            if(arr[i]==x){
                output[j] = i;
                j = j + 1;
            }
        }
        output[j] = -1;
        return output;
    }

    static int binarySearch(int[] arr,int key){
        int s = 0;
        int e = arr.length - 1;

        while(s<=e){
            int mid = (s+e)/2;
            if(arr[mid] > key){
                e = mid - 1;
            }
            else if(arr[mid] < key){
             s = mid + 1;
            }
            else{//equal
             return mid;
            }
        }
        //element is not found
        return -1;
    }
    static int binarySearchFirstOcc(int[] arr,int key){
        int s = 0;
        int e = arr.length - 1;
        int ans = -1; //assuming element doesn't exit but i will update once i get an occ

        while(s<=e){
            int mid = (s+e)/2;
            if(arr[mid] > key){
                e = mid - 1;
            }
            else if(arr[mid] < key){
                s = mid + 1;
            }
            else{
                //equal case is going to change?
                // update the ans and search left
                ans = mid;
                e = mid - 1;
            }
        }
        return ans;
    }

    static int binarySearchRec(int[] arr,int s,int e,int key){
        //base case
        if(s>e){
            return -1;
        }
        // actual case

        //rec case left or right or equal
        int mid = (s+e)/2;
        if(arr[mid]==key){
            return mid;
        }
        else if(arr[mid] > key){
            return binarySearchRec(arr,s,mid-1,key);
        }
        return binarySearchRec(arr,mid+1,e,key);
    }
    static int squareRootUsingBS(int n){

        int s = 0;
        int e = n;
        int ans = 0;
        while(s<=e){
            int mid = (s+e)/2;
            if(mid*mid <= n){
                //update the ans and search right
                ans = mid;
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }

        }
        return ans;
    }

    static int binarySearchLastOcc(int[] arr,int key){
        int s = 0;
        int e = arr.length - 1;
        int ans = -1; //assuming element doesn't exit but i will update once i get an occ

        while(s<=e){
            int mid = (s+e)/2;
            if(arr[mid] > key){
                e = mid - 1;
            }
            else if(arr[mid] < key){
                s = mid + 1;
            }
            else{
                //equal case is going to change?
                // update the ans and search left
                ans = mid;
                s = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {10,3,3,7,1,3,2};
        int sorted_arr[] = {1,2,4,8,11,11,11,11,11,11,13,17,20,22};
        Scanner sc = new Scanner(System.in);
        //System.out.println(binarySearchRec(sorted_arr,0,sorted_arr.length-1,8));
        int key = sc.nextInt();
        System.out.println(squareRootUsingBS(key));
        System.out.println(binarySearchFirstOcc(sorted_arr,key));
        System.out.println(binarySearchLastOcc(sorted_arr,key));

        /*
        int[] out = linearSearchAllReturn(arr,key);
        int idx = 0;
        while(out[idx]!=-1){
            System.out.println(out[idx]);
            idx++;
        }
        */

        /*
        int res = linearSearch(arr,key);
        if(res==arr.length){
            System.out.println("element is not found");
        }
        else {
            System.out.println(res);
        }*/
    }
}
