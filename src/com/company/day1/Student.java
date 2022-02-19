package com.company.day1;

public class Student {
    String name;
    int roll_number;
    float marks;
//    boolean anything;

    // default constructor
    Student (){
        this.name = "Nothing";
        this.roll_number = -1;
        this.marks = 0;
        System.out.println(this);
    }

    // Right constructor.
    Student(String name, int roll_number, float marks){
        this.name = name;
        this.roll_number = roll_number;
        this.marks = marks;
    }

    void display(){
        System.out.println("Name : " + this.name);
        System.out.println("Roll No. : " + this.roll_number);
        System.out.println("Marks : " + this.marks);
    }

    void greeting(){
        System.out.println("Hello Guy's, My name is " + this.name);
    }
}
