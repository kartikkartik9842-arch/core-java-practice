package Oops.interfacee;

public class Client {

    public static void main(String[] args) {

        Animal animal1 = new Dog();

        animal1.eat();
        animal1.sleep();
        // animal1.bark(); // Gives an error because the reference type is Animal.

        Animal animal2 = new Cat();
        animal2.eat();
        animal2.sleep();

        Dog dog = new Dog();
        dog.bark();
        System.out.println("Number of legs: " + Animal.LEGS);
    }
}