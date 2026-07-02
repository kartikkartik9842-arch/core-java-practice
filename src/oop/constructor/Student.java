package oop.constructor;

public class Student {
    String name;
    int age;
    String batch;

    public Student(String name, int age, String batch) {
        this.name = name;
        this.age = age;
        this.batch = batch;
    }

    // Cannot create another constructor with the same parameter types.
    // Constructor overloading requires a different number, type, or order of parameters.

    // public Student(String batch, int age, String age) {
    //     this.name = name;
    //     this.age = age;
    //     this.batch = batch;
    // }

    // Copy constructor - creates a new object by copying the values
    // from an existing Student object.
    public Student(Student student) {
        this.name = student.name;
        this.age = student.age;
        this.batch = student.batch;
    }

    // Java provides a default  constructor only if no constructor is explicitly
    // defined. Once we create any constructor, the default constructor is no
    // longer generated.
}