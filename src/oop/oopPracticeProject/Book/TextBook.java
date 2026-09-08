package oop.oopPracticeProject.Book;

public class TextBook extends Book{

    private TypeBook type;
    private String subject;
    private int edition;


    public TextBook(String isbn, String title, String author, Boolean isAvailable, String subject, int edition) {
        super(isbn, title, author, isAvailable);
        this.type=TypeBook.TEXTBOOK;
        this.subject=subject;
        this.edition=edition;
    }

    @Override
    public void displayBookDetails() {
        System.out.println("Book Details:");
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Available: " + getIsAvailable());
        System.out.println("Type: " + type);
        System.out.println("Subject: " + subject);
        System.out.println("Edition: " + edition);
    }

    @Override
    public TypeBook getType() {
        return this.type;
    }

}
