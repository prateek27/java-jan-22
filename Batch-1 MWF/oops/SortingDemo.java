package com.january.oops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortingDemo {

    public static void main(String[] args) {
        int arr[] = {10,20,13,7,21,91,82};
        // increasing order
        // inbuilt sort method
        Arrays.sort(arr);

        // for each loop
        for(int x:arr){
            System.out.println(x);
        }

        // ArrayList
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("guava");
        fruits.add("pineapple");
        fruits.add("banana");
        //lexicographic order -> appear in dictionary
        Collections.sort(fruits, Collections.reverseOrder());

        for(String x : fruits){
            System.out.println(x);
        }
    }
}
