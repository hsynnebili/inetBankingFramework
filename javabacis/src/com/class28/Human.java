package com.class28;

public class Human {
	String name;
    int age;
    

    Human (String name, int age){
        this.name = name;
        this.age = age;
    }
    

    void speak() {
        System.out.println("My name is " + name);
    }
}

class Tester extends Human {
    int salary;
    

    Tester(String name, int age, int salary){
        this(name, age);
        this.salary = salary;
    }
    

    Tester(String name, int age){
        super(name, age);
    }
    

    void speak() {
//        super.speak();
        System.out.println("Benim adim " + name);
    }
    

    void code() {
        System.out.println("...I am coding...");
    }
}
