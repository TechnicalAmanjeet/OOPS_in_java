package com.company.day2;

public class Human {
    String fullName, gender;
    int age, salary;
    boolean married;
    static long population = 0; // keep track of human object.

    Human(){
        population += 1;
    }

    public Human(String fullName, String gender, int age, int salary, boolean married) {
        this();
        this.fullName = fullName;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
        this.married = married;
    }


}
