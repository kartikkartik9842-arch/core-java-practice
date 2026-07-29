package oop.oopPracticeProject;

public class Member extends User{
    private int borrowedBooksCount;
    private static final int MAX_BORROW_LIMIT=5;

    public Member(String name , String contactInfo) {
        super(name, contactInfo);
    }

    public Member(User user){
        super(user);
    }

    public int getBorrowedBooksCount() {
        return borrowedBooksCount;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Member DashBoard");
        System.out.println("borrowed books count is " + this.getBorrowedBooksCount());
    }

    @Override
    public boolean canBorrowBooks() {
        if(this.borrowedBooksCount<MAX_BORROW_LIMIT){
            this.borrowedBooksCount++;
            return true;
        }
        return false;
    }
}
