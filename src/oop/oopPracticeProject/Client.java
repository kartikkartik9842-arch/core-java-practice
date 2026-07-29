package oop.oopPracticeProject;

public class Client {

    public static void main(String[] args) {
        User u1= new Member("Kartik", "9027");
        u1.generateUniqueId();
        u1.displayDashboard();
        u1.canBorrowBooks();
        System.out.println(u1.getUserId());

        System.out.println("------------------------");

        User u2= new Member(u1);
        System.out.println(u2.getName());
        System.out.println(u2.getUserId());


        System.out.println("------------------------");

        User u3= new Librarian("Ramesh", "2930", "1");
        u3.generateUniqueId();
        u3.displayDashboard();
        System.out.println(u3.getUserId());

        System.out.println("-----------------");
        User u4= new Librarian(u3, "2");
        u4.generateUniqueId();
        u4.displayDashboard();
        System.out.println(u4.getUserId());

        System.out.println(User.getTotalUsers() + " total users");



    }
}
