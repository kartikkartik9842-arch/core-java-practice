package Oops.accessModifiers;

public class Client {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "rohan";
        // student.age = 23; // Cannot be accessed because 'age' is private.
        student.batch = "en"; // Accessible because this class is in the same package.
        student.email = "kartik29"; // Accessible because default (package-private) members are accessible within the same package.
    }
}