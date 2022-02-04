package com.january.oops;

public class DogDemo {
    public static void main(String[] args) {
        // To test your real class,
        // Help to launch your java application/program
        Dog d = new Dog(2, "German Shepherd","Bruto"); //second constructor
        d.print();

        Dog d2 = new Dog(3, "Golden Retriver","Cruto"); //second constructor
        d2.print();

        Dog d3 = new Dog(); //first constructor
        d3.print();

    }
}

class Dog{
    int age;
    String breed;
    String name;

    // Special Method is known as constructor
    // constructor name is same as class name
    // get called automatically when an object is being created
    // it doesnt have a return and it is called only for each object
    Dog(){
        System.out.println("Making a dog object");
    }

    // Parameterised Constructor
    Dog(int age, String breed,String name){
        this.age = age;
        this.breed = breed;
        this.name = name;
    }

    void bark(){
        System.out.println("Woof Woof!");
    }
    void print(){
        System.out.println("Name "+name);
        System.out.println("Age "+age);
        System.out.println("Breed "+breed);
    }
}