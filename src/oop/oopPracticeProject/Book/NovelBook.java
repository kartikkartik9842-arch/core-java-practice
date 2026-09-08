package oop.oopPracticeProject.Book;

public class NovelBook extends Book{

    private String genre;
    private TypeBook type;

    public NovelBook(String isbn, String title, String author, Boolean isAvailable, String genre, TypeBook type) {
        super(isbn, title, author, isAvailable);
        this.type= TypeBook.NOVELBOOK;
        this.genre = genre;
    }

    @Override
    public void displayBookDetails() {
        System.out.println("Book Details:");
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Available: " + getIsAvailable());
        System.out.println("Type: " + type);
    }

    @Override
    public TypeBook getType() {
        return this.type;
    }
}
