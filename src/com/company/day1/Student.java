package com.company.day1;

public class Student {
    String name;
    int roll_number;
    float marks;
//    boolean anything;

    // default constructor => when we provide nothing then this constructor will run.
    Student (){
        this.name = "Nothing";
        this.roll_number = -1;
        this.marks = 0;
        System.out.println(this);
    }

    // when we provide 3 value as a input then this constructor will run.
    Student (String name, int roll_number, float marks){
        this.name = name;
        this.roll_number = roll_number;
        this.marks = marks;
    }

    // constructor which takes value from other object of same datatype.
    Student (Student other){
        this.name = other.name;
        this.roll_number = other.roll_number;
        this.marks = other.marks;
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
