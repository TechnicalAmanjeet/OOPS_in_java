package com.company.day1;

public class Student {
    String name;
    int roll_number;
    float marks;
    final int bonus = 50;
//    final float other; // will display error. bcz final variable has to be initalized at the time of creating it.

//    boolean anything;

    // default constructor => when we provide nothing then this constructor will run.
    // Student aman = new Student(); => here this will be replaced by aman.
//    Student (){
//        this.name = "Nothing";
//        this.roll_number = -1;
//        this.marks = 0;
//        System.out.println(this);
//    }

    Student (){
        // this is how you call other constructor from another constructor.
        this ("Amanjeet", 12, 97);
    }

    Student (int roll_number){
        this.roll_number = roll_number;
    }

    // when we provide 3 value as a input then this constructor will run.
    // Student aman = new Stuent("aman", 1, 98);
    // here this will be replaced by aman.
    Student (String name, int roll_number, float marks){
        this.name = name;
        this.roll_number = roll_number;
        this.marks = marks;
    }

    // constructor which takes value from other object of same datatype.
    // Student riya = new Student(Student other); => here this will replaced by riya.
    Student (Student other){
        // M1
        // this.name = other.name;
        // this.roll_number = other.roll_number;
        // this.marks = other.marks;

        // M2
        this(other.name, other.roll_number, other.marks);
    }

    void display(){
        System.out.println("Name : " + this.name);
        System.out.println("Roll No. : " + this.roll_number);
        System.out.println("Marks : " + this.marks);
        System.out.println("bonus : " + this.bonus);
    }

    void greeting(){
        System.out.println("Hello Guy's, My name is " + this.name);
    }


    // garbage collection destroyer and finalizer method.

    @Override
    protected void finalize() throws Throwable {
        System.out.println("object has been destroyed.." + this.roll_number);
    }
}
