package accessModifiersTest;


import accessModifiers.Student;

public class StudentChild extends Student {

    public void doSomething() {
        name = "kartik";      // Accessible because 'name' is public.
        //age = 23;             // Gives an error because 'age' is private.
        batch = "en";         // Accessible because 'batch' is protected and inherited by the subclass.
        //email = "kartik23";   // Gives an error because 'email' has default (package-private) access and is not accessible outside its package.
    }
}