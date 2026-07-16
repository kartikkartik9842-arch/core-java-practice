package oop.oopPracticeProject;

public abstract class User {
    private int userId;
    private String name;
    private String contactInfo;


    public User(){
        this.userId= 0;
    }

    public User(String name, String contactInfo){
        this.name=name;
        this.contactInfo=contactInfo;
    }

    public User(User user){
        this.name=user.getName();
        this.contactInfo=user.getContactInfo();
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
