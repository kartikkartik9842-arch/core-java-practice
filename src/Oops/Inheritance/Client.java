package Oops.Inheritance;

public class Client {

    public static void main(String[] args) {

        Dog dog = new Dog("Bruno", 3, "Labrador");

        dog.eat();      // Inherited from Animal
        dog.sleep();    // Inherited from Animal
        dog.bark();     // Dog's own method

        System.out.println();

        Cat cat = new Cat("Kitty", 2, "White");

        cat.eat();      // Inherited from Animal
        cat.sleep();    // Inherited from Animal
        cat.meow();     // Cat's own method
    }
}