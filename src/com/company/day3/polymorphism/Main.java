package com.company.day3.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();
        Tringle tringle = new Tringle();
        Square square = new Square();

        shape.area();
        circle.area();
        tringle.area();
        square.area();
    }
}
