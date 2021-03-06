package com.company.day2;

// outmost class can not be static so it will give an error.
//static class Amanjeet{
//    String name;
//    Amanjeet() {
//        this.name = "Amanjeet";
//    }
//}

class outside_nonstatic_class {
    String name;
    outside_nonstatic_class(String name){
        this.name = name;
    }
}

public class Innerclass {

    class Inside_non_static_class{
        String name;
        Inside_non_static_class(String name){
            this.name = name;
        }
    }

    static class Inside_static_class{
        String name;
        Inside_static_class(String name){
            this.name = name;
        }
    }

    static class static_inside_static{
        static int number;
        static_inside_static(int number){
            this.number = number;
        }
    }

    public static void main(String[] args) {
//        Inside_non_static_class a = new Inside_non_static_class("Amanjeet");
          // above line will give error bcz we are calling non-static inner class.

//        Inside_static_class a1 = new Inside_static_class("Amanjeet"); // it won't give error.
//        Inside_static_class a2 = new Inside_static_class("riya");
//        System.out.println(a1.name);
//        System.out.println(a2.name);

        outside_nonstatic_class a3 = new outside_nonstatic_class("amanjeet");
        System.out.println(a3.name);

        static_inside_static a4 = new static_inside_static(10);
        static_inside_static a5 = new static_inside_static(15);
        System.out.println(a4.number);
        System.out.println(a5.number);

    }
}
