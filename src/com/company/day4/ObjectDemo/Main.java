package com.company.day4.ObjectDemo;

public class Main {
    public static void main(String[] args) {
        System.out.println("will see about Object classes in details.");

        ObjDemo obj1 = new ObjDemo(10);
        ObjDemo obj2 = new ObjDemo(15);
        ObjDemo obj3 = obj1;
        ObjDemo obj4 = new ObjDemo(10);

//        System.out.println(obj1);
//        System.out.println(obj1.hashCode());
//        System.out.println(obj2.hashCode());

//        System.out.println(obj1.equals(obj2));
//        System.out.println(obj1 == obj2);
//        System.out.println(obj1 == obj3);

//        System.out.println(obj1.equals(obj2));
//        System.out.println(obj1.equals(obj3));
//        System.out.println(obj1.equals(obj4));

//        System.out.println(obj1.toString());
//        System.out.println(obj2.toString());
//        System.out.println(obj3.toString());
//        System.out.println(obj4.toString());

//        obj4 = obj1.clone();


//        // eg. of garbage collection in java.
//        for(int i=0; i<=1000000; ++i){
//            obj4 = new ObjDemo(i);
//        }

//        // is instance of eg.
//       InstanceOfObjDemo i = new InstanceOfObjDemo(1);
//        obj1 instanceof InstanceOfObjDemo ? ((InstanceOfObjDemo) obj1) : null;

        // eg of getClass.
        System.out.println(obj1.getClass().getConstructors().length);
    }
}
