package com.company.day1;

public class Main {
    public static void main(String[] args) {

        Student s; // declaring ref. variable s of datatype Student. ( NOT Initializing )
        //  System.out.println(s);  // gives error bcz ref. variable has not been Initialized.
        s = new Student();  // initializing the ref. variable.
        System.out.println(s);  // prints the location and type of ref. variable s is having.

        // creating a obj of Student class.
        Student s1 = new Student();  // declared and initialized ref var s1 of datatype/class Student.

        // set the attribute/property's value for s1 obj.
        s1.name = "Amanjeet";
        s1.roll_number = 1;
        s1.marks = 97;

        // display all the attribute's value of s1 object.
        System.out.println("Name : " + s1.name);
        System.out.println("Roll No. : " + s1.roll_number);
        System.out.println("Marks : " + s1.marks);
    }
}
