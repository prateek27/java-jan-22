package com.january.twodarray;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        //Todo: Play with arraylist https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html

        // Init Size
        ArrayList<Integer> arr = new ArrayList<>();

        //Insertion
        arr.add(5);
        arr.add(7);
        arr.add(8);
        arr.add(10);
        arr.add(2,6);

        // Remove
        arr.remove(0); //removes 5 from the 0th place

        Integer val = 7;
        System.out.println((arr.remove(val))); // supplying an Integer object

        //Deletion
        for(int i=0; i<arr.size(); i++){
            //Get
            System.out.println(arr.get(i));
        }

    }

}
