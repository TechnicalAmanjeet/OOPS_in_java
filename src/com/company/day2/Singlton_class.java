package com.company.day2;

public class Singlton_class {
    String name;

    // constructor must be private in singlton class.
    private Singlton_class (String name){
        this.name = name;
    }

    // static Singlton_class type variable which will contain singlton class obj.
    static Singlton_class onlyInstance;

    // static method to create new obj and call constructor once.
    public static Singlton_class getInstance( String name){
        if(onlyInstance == null){
            System.out.println("creating instatnce for first time.");
            onlyInstance = new Singlton_class(name);
        }
        else{
            System.out.println("One object already created.");
        }
        return onlyInstance;
    }
}
