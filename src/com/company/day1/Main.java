package com.company.day1;

public class Main {
    public static void main(String[] args) {

//        Student s; // declaring ref. variable s of datatype Student. ( NOT Initializing )
//        //  System.out.println(s);  // gives error bcz ref. variable has not been Initialized.
//        s = new Student();  // initializing the ref. variable.
//        System.out.println(s);  // prints the location and type of ref. variable s is having.


//        // creating a obj of Student class.
//        Student s1 = new Student();  // declared and initialized ref var s1 of datatype/class Student.
//
//        // set the attribute/property's value for s1 obj.
//        s1.name = "Amanjeet";
//        s1.roll_number = 1;
//        s1.marks = 97;
//
//        // display all the attribute's value of s1 object.
//        System.out.println("Name : " + s1.name);
//        System.out.println("Roll No. : " + s1.roll_number);
//        System.out.println("Marks : " + s1.marks);


        // ******* started doing fancy work from here ***********

//        String s1 = new Student();  // incompatible bcz student type can't be converted to String.
//        int s1 = new Student();  // same problem as we have above

//        Student[] students;
//        System.out.println(students); // students ref. var might not have been initialized.


//        Student s1;  // initializing ref. variable of type student.
//        s1 = new Student();  // pointing ref. variable s to type student variable in heap memory.
//
//        // the above two line we can do in a single line.
//        Student s2 = new Student(); // initializing and pointing / declaring.
//
//        System.out.println(s1);  // gives the definition of obj => i.e what is the datatype/class of object;

//      ******* Accessing Instance variable before initializing it. *******

//        // now before initialization of class/instance variable => if we want to access then it will print
//        // by default value of each instance variable.
//        // for type int => print 0
//        // for type string => print null
//        // for type float => print 0.0
//        // for type boolean => print false.
//        System.out.println("\nBefore Initialization of Instance variable : ");
//        System.out.println(s1.name);
//        System.out.println(s1.roll_number);
//        System.out.println(s1.marks);
//        System.out.println(s1.anything);
//
////      ****** Initialize the Instance variable ********
//        s1.name = "Amanjeet";
//        s1.roll_number = 1;
//        s1.marks = 98;
//        s1.anything = true;
//
////      **** Now, again access the instance variable after initialization *****
//        System.out.println("\nAfter Initialization of Instance variable : ");
//        System.out.println(s1.name);
//        System.out.println(s1.roll_number);
//        System.out.println(s1.marks);
//        System.out.println(s1.anything);

////      ***** working with constructor containing class **********
//        Human h1 = new Human(); // create an object of class Human. at the time of creating the obj.
//        // the special method i.e constructor will be called.
//
//        h1.display();

//        Student student0 = new Student("Amanjeet", 1, 89);
//        Student student1 = new Student("Riya", 2, 90);
//        Student student2 = new Student("Kismat", 3, 93);
//        Student student3 = new Student("Neha", 4, 95);
//        Student student4 = new Student("Kajal", 5, 98);
//
////        student0.display();
////        student1.display();
////        student2.display();
////        student3.display();
////        student4.display();
//
//        Student mylove = new Student(student1);
//        mylove.greeting();
//        mylove.display();
//
////        Student random = new Student(marks= 5, "Amanjeet", 12) // it's takes data in a was as we have created in
//        // the constructor. otherwise it gives error.


        // will see how to ref variable pointing to same object so
        // when we change instance attributes from one ref. variable then
        // it leads to change visible in other ref variable as well.

//        Student student = new Student("Amanjeet", 1, 98);
//        System.out.println("Starting display : ");
//        student.display();
//        Student other = student;
//        other.display();
//        System.out.println();
//
//        other.name = "Riya";
//        System.out.println("After change : ");
//        student.display();
//        other.display();
//        System.out.println();

        // ****** will look example of final keyword *********
//        final int bonous = 50;
//        bonous = 20; // will say can not assign value to bonus bcz its a final variable.

//        FinalExample obj = new FinalExample();
//        System.out.println(obj.name);
//        System.out.println(obj.value);
//
//        FinalExample obj1 = obj;
//        System.out.println(obj1.name);
//        System.out.println(obj1.value);
    }
}
