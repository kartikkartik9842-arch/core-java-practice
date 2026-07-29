package oop.oopPracticeProject.users;

import java.util.Random;

public abstract class User {
    private String userId;
    private static int totalUsers;
    private String name;
    private String contactInfo;
    private static final Random random = new Random();

    public User(){
        this.userId=String.valueOf(generateUniqueId());
        totalUsers++;
    }

    public User(String name, String contactInfo){
        this.userId=String.valueOf(generateUniqueId());
        this.name=name;
        this.contactInfo=contactInfo;
        totalUsers++;
    }

    public User(User user){
        this.userId=String.valueOf(generateUniqueId());
        this.name=user.getName();
        this.contactInfo=user.getContactInfo();
        totalUsers++;
    }

    public static int getTotalUsers(){
        return totalUsers;
    }

    public String getUserId(){
        return userId;
    }

    public final int generateUniqueId(){
         return random.nextInt(100000);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public abstract void displayDashboard();
    public abstract boolean canBorrowBooks();


}
