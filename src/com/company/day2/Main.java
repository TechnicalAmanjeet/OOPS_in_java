package com.company.day2;

public class Main {
    public static void main(String[] args) {

//        // will see the eg. of static keyword.
//        System.out.println("Human object : " + Human.population);
//        Human h1 = new Human("Amanjeet", "male", 21, 12000, false);
//
//        System.out.println("After creating a human object : ");
//        System.out.println("From Human classname : " + Human.population);
//        System.out.println("from h1 object : " + Human.population);
//
//        // creating one more object
//        Human h2 = new Human();
//        System.out.println("After creating 2nd   human object : ");
//        System.out.println("From Human classname : " + Human.population);
//        System.out.println("from h1 object : " + Human.population);
//
//
//        // calling static method
//        Human.staticMethod();


        // The popular static method => psvm => public static void main
        // we can call static properties and methods without creating an object.
        Human.staticMethod();
        System.out.println(Human.population); // Human.population;

        // we can not access non-static method from a static method.
//        greeting(); // error bcz we can not access non-static methods.
        greeting1(); // will not give error.
    }

    // will give error when we call it from a static method. bcz its non-static method.
    void greeting(){
        System.out.println("greet");
    }

    // will not give any error if we call either from static or non static method.
    static void greeting1(){
        System.out.println("greet from static method.");
    }
}
