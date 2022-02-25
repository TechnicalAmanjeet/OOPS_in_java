package com.company.day3;

public class Child1_Box extends Box {
    float weight = -1;

    public Child1_Box(){
        super();
    }

    public Child1_Box(float weight) {
        super(); // calling constructor of of super class and initializing the properties of parent class.
        this.weight = weight;
    }

    public Child1_Box(int l, int h, int w){
        super(l, w, h);
    }

    public Child1_Box(int l, int h, int w, int weight){
        super(l, w, h);
        this.weight = weight;
    }

    public Child1_Box(int wide){
        super(wide);
    }

    public Child1_Box(int wide, float weight){
        super(wide);
        this.weight = weight;
    }

    public Child1_Box(Box other){
        super(other);
    }

    public Child1_Box(Box other, int weight){
        super(other);
        this.weight = weight;
    }

    public Child1_Box(Child1_Box other){
        this(other.l, other.w, other.h, other.w);
    }

    void show(){
        super.show();
        System.out.println("Weight : " + this.weight);
    }

    void showWeight(){
        System.out.println("Weight " + this.weight);
    }

    void parantAndChild(){
        System.out.println("from child1_box");
    }

    void weight(){
        System.out.println("from child1 box i.e weight.");
    }

    void common_to_3(){
        System.out.println("from box");
    }
}
