package oop.oopPracticeProject;

public class Librarian extends User{

    private  String  employeeNumber;

    public Librarian(String name , String contactInfo, String employeeNumber){
        super(name, contactInfo);
        this.employeeNumber=employeeNumber;
    }
    public Librarian(User user, String employeeNumber){
        super(user);
        this.employeeNumber=employeeNumber;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Librarian Dashboard");
        System.out.println("employee id: " + this.employeeNumber);
    }

    @Override
    public boolean canBorrowBooks() {
        return true;
    }

//    public void addBook(Book book){
//
//    }

//    public void removeBook(Book book){
//
//    }
}
