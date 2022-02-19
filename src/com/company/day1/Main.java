package com.company.day1;

public class Main {
    public static void main(String[] args) {

        // creating a obj of Student class.
        Student s1 = new Student();

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
