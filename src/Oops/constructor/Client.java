package Oops.constructor;

public class Client {
    public static void main(String[] args) {

        // Parameterized constructor
        Student s1 = new Student("Kartik", 25, "Backend LLD");

        System.out.println("Student 1");
        System.out.println("Name  : " + s1.name);
        System.out.println("Age   : " + s1.age);
        System.out.println("Batch : " + s1.batch);

        System.out.println();

        // Copy constructor
        Student s2 = new Student(s1);

        System.out.println("Student 2 (Copy)");
        System.out.println("Name  : " + s2.name);
        System.out.println("Age   : " + s2.age);
        System.out.println("Batch : " + s2.batch);

        System.out.println();

        // Changing the copied object's data
        s2.name = "Avinash";
        s2.batch = "Java";

        System.out.println("After modifying copied object");
        System.out.println("Student 1 Name : " + s1.name);
        System.out.println("Student 2 Name : " + s2.name);
    }
}
