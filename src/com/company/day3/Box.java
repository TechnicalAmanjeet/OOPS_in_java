package com.company.day3;

public class Box {
    int l,w,h; // contain l => length, w => width and h => height of box.


    // default constructor.
    public Box() {
        super(); //calling by default constructor of parent class. by default every class has parent  class Object.
        this.l = this.w = this.h = -1;
    }

    // constructor which takes 3 parameter i.e l, w, h as input and set that accordingly.
    public Box(int l, int w, int h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    // make object of cube type.
    public Box(int wide){
        this.l = this.w = this.h = wide;
    }

    // create object similar as other object.
    public Box(Box other){
        this(other.l, other.w, other.h);
    }


    // Execution of program will start from here.
    public static void main(String[] args) {
        Box a = new Box(12);
        System.out.println(a.l + " " + a.h + " " + a.w);
    }

    void show(){
        System.out.println("Length : " + this.l);
        System.out.println("Width : " + this.w);
        System.out.println("Height : " + this.h);
    }

    void box() {
        System.out.println("from box.");
    }

    void parantAndChild(){
        System.out.println("from box");
    }

    void common_to_3(){
        System.out.println("from box");
    }
}
