package com.company.day2;

public class StaticBlock {
    static int a = 5;
    static int b;

    // this block will be going to execute once only when for the first time this class will load in program.
    static {
        System.out.println("Inside default static.");
        b = a * 4;
    }

//    public static void main(String[] args) {
//        System.out.println(StaticBlock.a);
//        System.out.println(StaticBlock.b);
//    }
}
