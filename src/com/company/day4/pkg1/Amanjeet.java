package com.company.day4.pkg1;


public class Amanjeet {

    public int num;
    String name;

    public Amanjeet() {
        this.name = "Amanjeet";
        this.num = 200;
    }

    public Amanjeet(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public static void main(String[] args) {
        Amanjeet a = new Amanjeet();
        System.out.println(a.num);
    }
}
