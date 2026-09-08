package oop.oopPracticeProject.Book;

import oop.oopPracticeProject.users.User;

public abstract class Book implements Lendable {
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;
    private String lendby;

    public Book(String isbn, String title, String author, Boolean isAvailable) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
        this.lendby=null;
    }
    public Book(Book book) {
        this.isbn = book.getIsbn();
        this.title = book.getTitle();
        this.author = book.getAuthor();
        this.isAvailable = book.getIsAvailable();
    }

    @Override
    public boolean lend(User user){
        if(this.isAvailable){
            if(user.canBorrowBooks()){
                this.isAvailable = false;
                this.lendby= user.getUserId();
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isAvailable(){
        return isAvailable;
    }

    @Override
    public void returnBook(User user){
        if (user.getUserId().equals(this.lendby)) {
            this.isAvailable = true;
            System.out.println("Book returned successfully");
        } else {
            System.out.println("You haven't lent this book");
        }
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public abstract void displayBookDetails();

    public abstract TypeBook getType();
}
