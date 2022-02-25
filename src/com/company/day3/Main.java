package com.company.day3;

public class Main {
    public static void main(String[] args) {
        // System.out.println("will start with day3");

        // prop 1. inheritance eg. of parent class => working fine.
//        Box box = new Box();
//        box.show();
//
//        Box box1 = new Box(10);
//        box1.show();
//
//        Box box2 = new Box(2, 3, 4);
//        box2.show();
//
//        Box box3 = new Box(box);
//        box3.show();

        // eg. of child class
        Child1_Box b = new Child1_Box();
        b.show();

        Child1_Box b1 = new Child1_Box(1);
        b1.show();

        Child1_Box b2 = new Child1_Box(2f);
        b2.show();

        Child1_Box b3 = new Child1_Box(b);
        b3.show();

    }
}
