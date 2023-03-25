package io.javabrains.javabasics;

public class Cat extends InheritanceChallenge{
    private String name;
    private int age;
    public Cat(String name, int age) {
        super(name, age);
    }

    public void makeSound(){
        System.out.println("Car meows");
    }
}
