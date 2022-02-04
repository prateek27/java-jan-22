package com.january.oops;

import javax.sound.midi.Soundbank;

// A .java file it can have one or more class
public class ProductDemo {
    // try to demonstrate a "product"
    public static void main(String[] args) {
        // starting of the application
        Product p1 = new Product();

        //write the properties
        p1.name = "CameraX100";
        //p1.price = 10500;
        p1.seller = "Sony";
        p1.print();

        //read them
        /*System.out.println(p1.name);
        System.out.println(p1.price);
        System.out.println(p1.seller)*/;
        Dog d = new Dog();
        d.bark();

    }
}

class Product{
    //Instance Variables
    String name;
    int price;
    String seller;

    //Methods
    void print(){
        System.out.println("Name " + name);
        System.out.println("Price " + price);
        System.out.println("Seller " + seller);
    }
}


