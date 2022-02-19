package com.company.day1;

public class Human {
    int eye, ear, mouth, nose, hand, foot, total_hand_finger, total_feet_finger;

    Human(){
        this.eye = this.ear = this.hand = this.foot = 2;
        this.mouth = this.nose = 1;
        this.total_feet_finger = this.total_hand_finger = 10;
    }

    void display(){
        System.out.println("This Human Has :>");
        System.out.println("Eye : " + this.eye);
        System.out.println("Ear : " + this.ear);
        System.out.println("Hand : " + this.hand);
        System.out.println("Foot : " + this.foot);
        System.out.println("Mouth : " + this.mouth);
        System.out.println("Nose : " + this.nose);
        System.out.println("Total feet finger : " + this.total_feet_finger);
        System.out.println("Total hand finger : " + this.total_hand_finger);
    }

    public static void main(String[] args) {
        Human h1 = new Human();
        h1.display();
    }
}
