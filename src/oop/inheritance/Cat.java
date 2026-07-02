package oop.inheritance;

public class Cat extends Animal {

    String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public void meow() {
        System.out.println(name + " is meowing.");
    }
}