package io.javabrains.javabasics;

public class Dog extends InheritanceChallenge{
    private String name;
    private String age;
    public Dog(String name, int age) {
        super(name, age);
    }
    public void makeSound(){
        System.out.println("Dog barks");
    }
}
