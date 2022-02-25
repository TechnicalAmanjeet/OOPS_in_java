package com.company.day3;

public class Child1_Box_price extends Child1_Box{
    float price = 0;

    public Child1_Box_price(){
        super();
        this.price = 0;
    }

    public Child1_Box_price(float price) {
        super();
        this.price = price;
    }

    public Child1_Box_price(Child1_Box_price other){
        super(other);
        this.price = other.price;
    }

    public Child1_Box_price(int l, int w, int h, int weight, int price){
        super(l, w, h, weight);
        this.price = price;
    }

    void showprice(){
        System.out.println("price : " + this.price);
    }

    void price(){
        System.out.println("from price.");
    }

    @Override
    void show() {
        super.show();
        System.out.println("Price : " + this.price);
    }

    void common_to_3(){
        System.out.println("from price");
    }
}
