package oop.oopPracticeProject;

import oop.oopPracticeProject.users.User;

public abstract class Book implements Lendable {
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String isbn, String title, String author, Boolean isAvailable) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    @Override
    public boolean lend(User user){
        if(this.isAvailable){
            user.canBorrowBooks();
        }
        return false;
    }

    @Override
    public boolean isAvailable(){
        return isAvailable;
    }

    @Override
    public void returnBook(User user){
        
    }

    public abstract void displayBookDetails();

}
