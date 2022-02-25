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

//        // eg. of child class
//        Child1_Box b = new Child1_Box();
//        b.show();
//
//        Child1_Box b1 = new Child1_Box(1);
//        b1.show();
//
//        Child1_Box b2 = new Child1_Box(2f);
//        b2.show();
//
//        Child1_Box b3 = new Child1_Box(b);
//        b3.show();

        // doing weird thing in inheritance.
        // 1. ref. var => type parent &&& initializing => type child
//        Box box = new Child1_Box(1,2,3,4); // ref var => Box type but referencing to Child1_box.
//        // in this case we will be able to access all variable of Box .
//        System.out.println(box.l + " " + box.w + " " + box.h + " ");
//        // but will not be able to access variable of child1_box.
////        System.out.println(box.weight).
////        box.showWeight(); // will not be able to access those variable and methods which is only in child class.
//
//        // but will be able to access which is both in parent and child
//        box.parantAndChild(); // and output will be according to child class.


        // 2. ref var : type child &&&&& initialize : type parant.
//        Child1_Box box1 = new Box(); // will simply give error.

        // eg. of multilevel inheritance.
        Child1_Box_price b5 = new Child1_Box_price(1, 2, 3, 4,5);
        b5.show();

        Child1_Box_price b1 = new Child1_Box_price();
//        System.out.println(b1.l + " " + b1.price); // will only be able to access all the data of Box class.
        b1.common_to_3();


    }
}
