package com.company.day3.polymorphism;

public class Shape {
    // will give error. bcz final methods can not be overridden.
//    final void area(){
//        System.out.println("Area of shape.");
//    }

    void area(){
        System.out.println("Area of shape.");
    }
}
