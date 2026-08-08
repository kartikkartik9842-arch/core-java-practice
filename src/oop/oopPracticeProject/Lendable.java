package oop.oopPracticeProject;

import oop.oopPracticeProject.users.User;

public interface Lendable {
    boolean lend(User user);
    void returnBook(User user);
    boolean isAvailable();

}
