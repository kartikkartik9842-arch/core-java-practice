package oop.oopPracticeProject;

import oop.oopPracticeProject.Book.Book;
import oop.oopPracticeProject.Book.NovelBook;
import oop.oopPracticeProject.Book.TextBook;
import oop.oopPracticeProject.Book.TypeBook;
import oop.oopPracticeProject.users.Librarian;
import oop.oopPracticeProject.users.Member;
import oop.oopPracticeProject.users.User;

import java.util.List;

public class Client {

    public static void main(String[] args) {

        // =====================================================
        // MILESTONE A - USER
        // =====================================================

        System.out.println("========== MILESTONE A ==========");

        Member u1 = new Member("Kartik", "902");
        Member u2 = new Member("Rohit", "941");
        Librarian u3 = new Librarian("Ramesh", "942", "EMP-1");

        // Copy constructors
        Member u4 = new Member(u1);
        Librarian u5 = new Librarian(u3, "EMP-2");

        // Total users
        System.out.println("Total users: " + User.getTotalUsers());

        // Dashboard / overriding
        u1.displayDashboard();
        u3.displayDashboard();

        // Borrow permission
        System.out.println("u1 can borrow: " + u1.canBorrowBooks());
        System.out.println("u3 can borrow: " + u3.canBorrowBooks());


        // =====================================================
        // MILESTONE B - BOOK
        // =====================================================

        System.out.println("\n========== MILESTONE B ==========");

        NovelBook book1 = new NovelBook(
                "12",
                "Roman ke Gunah",
                "John",
                true,
                "Crime",
                TypeBook.NOVELBOOK
        );

        NovelBook book2 = new NovelBook(
                "13",
                "Gunaho ka Devta",
                "Bharti",
                true,
                "Romance",
                TypeBook.NOVELBOOK
        );

        TextBook book3 = new TextBook(
                "15",
                "Math NCERT",
                "NCERT",
                true,
                "Mathematics",
                12
        );

        TextBook book4 = new TextBook(
                "16",
                "Physics NCERT",
                "NCERT",
                true,
                "Physics",
                11
        );


        // displayBookDetails()
        book1.displayBookDetails();
        book3.displayBookDetails();

        // =====================================================
        // LENDABLE - LENDING
        // =====================================================

        System.out.println("\n========== LENDING ==========");

        System.out.println("Book1 available: " + book1.isAvailable());

        if (book1.lend(u1)) {
            System.out.println("u1 successfully borrowed book1");
        } else {
            System.out.println("u1 could not borrow book1");
        }

        System.out.println("Book1 available: " + book1.isAvailable());


        // Same book - another user tries
        if (book1.lend(u2)) {
            System.out.println("u2 successfully borrowed book1");
        } else {
            System.out.println("u2 could not borrow book1 because book is unavailable");
        }


        // =====================================================
        // MILESTONE C - COLLECTIONS
        // =====================================================

        System.out.println("\n========== MILESTONE C ==========");

        LibraryManagementSystem library =
                new LibraryManagementSystem();

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        library.registerUser(u1);
        library.registerUser(u2);
        library.registerUser(u3);


        // =====================================================
        // SEARCH
        // =====================================================

        System.out.println("\n========== SEARCH ==========");

        List<Book> result1 =
                LibraryManagementSystem.searchBooks("gunaho");

        System.out.println(
                "Search 'gunaho': " + result1.size()
        );

        List<Book> result2 =
                LibraryManagementSystem.searchBooks(
                        "gunaho",
                        "NOVELBOOK"
                );

        System.out.println(
                "Search 'gunaho' + NOVELBOOK: " + result2.size()
        );


        // =====================================================
        // DISPLAY ALL BOOKS
        // =====================================================

        System.out.println("\n========== ALL BOOKS ==========");

        library.displayAllBooks();


        // =====================================================
        // DISPLAY REGISTERED USERS
        // =====================================================

        System.out.println("\n========== REGISTERED USERS ==========");

        library.displayRegisteredUsers();


        // =====================================================
        // RETURN
        // =====================================================

        System.out.println("\n========== RETURN ==========");

        System.out.println(
                "Before return: " + book1.isAvailable()
        );

        // Wrong user tries to return
        System.out.println("u2 tries to return book1:");
        book1.returnBook(u2);

        System.out.println(
                "After wrong return: " + book1.isAvailable()
        );

        // Correct user returns
        System.out.println("u1 returns book1:");
        book1.returnBook(u1);

        System.out.println(
                "After correct return: " + book1.isAvailable()
        );


        // =====================================================
        // LEND AFTER RETURN
        // =====================================================

        System.out.println("\n========== LEND AFTER RETURN ==========");

        if (book1.lend(u2)) {
            System.out.println(
                    "u2 successfully borrowed book1 after return"
            );
        } else {
            System.out.println(
                    "u2 could not borrow book1"
            );
        }


        // =====================================================
        // BORROWING LIMIT
        // =====================================================

        System.out.println("\n========== BORROWING LIMIT ==========");

        NovelBook book5 = new NovelBook(
                "17",
                "Book Five",
                "Author Five",
                true,
                "Genre",
                TypeBook.NOVELBOOK
        );

        NovelBook book6 = new NovelBook(
                "18",
                "Book Six",
                "Author Six",
                true,
                "Genre",
                TypeBook.NOVELBOOK
        );

        NovelBook book7 = new NovelBook(
                "19",
                "Book Seven",
                "Author Seven",
                true,
                "Genre",
                TypeBook.NOVELBOOK
        );

        System.out.println("Borrow book5: " + book5.lend(u1));
        System.out.println("Borrow book6: " + book6.lend(u1));
        System.out.println("Borrow book7: " + book7.lend(u1));

        System.out.println(
                "u1 borrowed books count: "
                        + u1.getBorrowedBooksCount()
        );

        System.out.println("\n========== END ==========");
    }
}