package accessModifiersTest;

import accessModifiers.Student;

public class Client {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "rohan";
        // student.age = 23; // Cannot be accessed because 'age' is private.
        //student.batch = "en"; // Gives an error because 'batch' is protected and this class is in a different package (not a subclass).
        //student.email = "kartik29"; // Gives an error because 'email' has default (package-private) access and is not accessible outside its package.
    }
}
