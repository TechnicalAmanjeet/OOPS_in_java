package com.company.day3.polymorphism;

// we can not inherit final class classes.
public final class FinalClass {
    void area(){
        System.out.println("area is default.");
    }

    void area(int r){
        System.out.println("customise area.");
    }
}
