package oop.accessModifiers;


public class StudentChild extends Student {

    public void doSomething() {
        name = "kartik";      // Accessible because 'name' is public.
        //age = 23;             // Gives an error because 'age' is private.
        batch = "en";         // Accessible because 'batch' is protected.
        email = "katik23.";   // Accessible because 'email' has default (package-private) access and this class is in the same package.
    }
}