package com.company.day2;

class class_with_custom_tostring{
    String name;

    public class_with_custom_tostring(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name.toUpperCase();
    }
}

public class Custemise_to_string_method {
    String name;

    public Custemise_to_string_method(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Custemise_to_string_method a = new Custemise_to_string_method("amanjeet");
        System.out.println(a.name);
        System.out.println(a);

        // calling custom tostring method.
        class_with_custom_tostring b = new class_with_custom_tostring("riya");
        System.out.println(b.name);
        System.out.println(b);

    }
}
