package com.jan2.twoDArrays;

import java.util.ArrayList;

public class ArrayListDemo {
    //Todo: Play with arraylist https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(100);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(9);
        arr.add(3,8);

        // Remove
        arr.remove(1);
        Integer obj = 7;
        arr.remove(obj);


        //Print
        for(int i=0; i < arr.size(); i++){
            System.out.println(arr.get(i));
        }


    }

}
