package com.jan2.stringsdemo;

import java.util.Scanner;

public class StringsDemo {

    static void findWord(String paragraph, String word){
        //Time to Try : print all occ of word in paragraph
        paragraph = paragraph.toLowerCase();
        word = word.toLowerCase();

        int idx = paragraph.indexOf(word);
        while(idx!=-1){
            System.out.println(idx);
            //let search for the next index
            idx = paragraph.indexOf(word,idx+1);
        }
    }

    public static void main(String[] args) {
        String a = "Hello";
        String b = "Hello";
        String c = "Hi";
        String d = "नमस्ते";


        System.out.println(b + b.length());
        System.out.println(d + d.length());

        //Iterate over string
        for(int i=0; i<b.length(); i++){
            System.out.println(b.charAt(i));
        }

        // Memory Level (Comparison)
        System.out.println(a==b);
        System.out.println(a.equals(b));

        // There is another way to create strings using 'new' keyword
        String x = new String("hi");
        String y = new String("hi");

        System.out.println(x==y);
        System.out.println(x.equals(y));

        // You can't modify the string but you can
        // create a character array & modify it
        char[] arr = x.toCharArray();
        arr[0] = 'b';
        System.out.println(arr);
        // create a new string from a character array
        String ns = new String(arr);
        System.out.println(ns);

        // String Class provides with many additonal functionalities
        String name = "Java";
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.concat(" Programming"));
        System.out.println(name); // name = name.someMethod(...)

        //Create Scanner
        Scanner sc = new Scanner(System.in);
        // Search for a Small String inside a big String
        String paragraph = "We are learning Java Programming, java is a cool lang, Java is object-oriented language";
        String line = sc.nextLine();
        // System.out.println(line);
        // System.out.println(paragraph.toLowerCase().indexOf(line.toLowerCase()));

        findWord(paragraph,line);
    }
}
