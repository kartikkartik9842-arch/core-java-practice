package oop.oopPracticeProject;

import oop.oopPracticeProject.Book.Book;
import oop.oopPracticeProject.users.User;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {
    static List<Book> bookInventory= new ArrayList<>();
    static List<User> registeredUsers= new ArrayList<>();

    public void addBook(Book book){
        if(book!=null){
            bookInventory.add(book);
        }
    }
    public void registerUser(User user){
        if(user!=null){
            registeredUsers.add(user);
        }
    }
    public static List<Book> searchBooks(String criteria, String type) {
        List<Book> result = new ArrayList<>();

        for (Book book : bookInventory) {
            if ((book.getTitle().toLowerCase().contains(criteria.toLowerCase())
                    || book.getAuthor().toLowerCase().contains(criteria.toLowerCase()))
                    && book.getType().toString().equalsIgnoreCase(type)) {
                result.add(book);
            }
        }

        return result;
    }

    public static List<Book> searchBooks(String criteria) {
        List<Book> result = new ArrayList<>();

        for (Book book : bookInventory) {
            if (book.getTitle().toLowerCase().contains(criteria.toLowerCase())
                    || book.getAuthor().toLowerCase().contains(criteria.toLowerCase())) {
                result.add(book);
            }
        }

        return result;
    }

    public void displayAllBooks() {
        for (Book book : bookInventory) {
            book.displayBookDetails();
        }
    }

    public void displayRegisteredUsers() {
        for (User user : registeredUsers) {
            user.displayDashboard();
        }
    }
}
