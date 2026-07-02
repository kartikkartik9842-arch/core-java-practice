package oop.abstraction;

public abstract class Animal {

    String name;

    public Animal(String name) {
        this.name = name;
    }

    // Concrete method
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    // Abstract method
    // Child classes must provide the implementation.
    public abstract void makeSound();
}