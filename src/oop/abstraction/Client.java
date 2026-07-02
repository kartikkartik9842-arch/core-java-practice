package oop.abstraction;

public class Client {

    public static void main(String[] args) {
        // Animal animal = new Animal("Animal");
        // Gives an error because an abstract class cannot be instantiated.
        Animal dog = new Dog("Bruno");
        dog.makeSound();
        dog.sleep();

        Animal cat = new Cat("Kitty");
        cat.makeSound();
        cat.sleep();
    }
}