package com.company.day2;

public class Main {
    public static void main(String[] args) {

        // will see the eg. of static keyword.
        System.out.println("Human object : " + Human.population);
        Human h1 = new Human("Amanjeet", "male", 21, 12000, false);

        System.out.println("After creating a human object : ");
        System.out.println("From Human classname : " + Human.population);
        System.out.println("from h1 object : " + Human.population);

        // creating one more object
        Human h2 = new Human();
        System.out.println("After creating 2nd   human object : ");
        System.out.println("From Human classname : " + Human.population);
        System.out.println("from h1 object : " + Human.population);


        // calling static method
        Human.staticMethod();

    }
}
