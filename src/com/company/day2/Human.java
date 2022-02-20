package com.company.day2;

public class Human {
    String fullName, gender;
    int age, salary;
    boolean married;
    // creating static variable.
    static long population = 0; // keep track of human object.

    Human(){
//        this.population += 1;
        Human.population += 1; // it's a good convention that always try to access static variable and method by
        // using Class name. ( in this case it's Human ).
    }


    public Human(String fullName, String gender, int age, int salary, boolean married) {
        this();
        this.fullName = fullName;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
        this.married = married;
    }

    // creating static methods.
    static void staticMethod(){
        System.out.println("messaging through static method of Human class.");
    }

}
