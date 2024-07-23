package org.example;

public class Dev {

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dev (int age) {
        this.age = age;
    }

    private Laptop laptop;

    public Dev () {
        System.out.println("Dev constructor");
    }


    public void build () {
        System.out.println ("Yes I am building a project.");
    }
}
