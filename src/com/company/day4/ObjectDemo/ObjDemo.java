package com.company.day4.ObjectDemo;

public class ObjDemo {
    int num;
    String name = "Amanjeet";

    public ObjDemo(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public ObjDemo(int num) {
        this.num = num;
    }

    // 1. override method of Object class.
    @Override
    public int hashCode() {
//        return super.hashCode();
        return num; // modified hashcode function.
    }

    // modifiying equals method.

    // 2nd override method of Object class.
    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj);
        // return this.num == obj.num; // give error need to typecast obj to ObjDemo
        return this.num == ((ObjDemo)obj).num; // modified equals() method for this class.
    }

    // 3rd override method of Object class.
    @Override
    public String toString() {
        // return super.toString();
        return this.name; // returning the name.
    }

    // 4th override method of Object class.

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // will learn more about it.
    }

    // 5th override method of Object class.

    @Override
    protected void finalize() throws Throwable {
//        super.finalize();
        System.out.println("garbage collection done. " + this.num);
    }

   // getter of num.
    public int getNum() {
        return num;
    }

    // setter for num.
    public void setNum(int num) {
        this.num = num;
    }

    // 6th override method of object class.

}
