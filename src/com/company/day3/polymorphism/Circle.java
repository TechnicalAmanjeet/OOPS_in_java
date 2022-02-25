package com.company.day3.polymorphism;

public class Circle extends Shape{
    @Override // annotation, we write it to override the method of parent classes.
    final void area(){
        System.out.println("Area of Circle : pi * r * r.");
    }

    void area(int a){
        System.out.println("Area of circle : " +  3.14 * a * a);
    }

    static void a(){
        System.out.println("from Circle");
    }

    static void a(int a){
        System.out.println("from Circle a");
    }
}
