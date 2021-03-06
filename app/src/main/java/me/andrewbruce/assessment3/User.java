package me.andrewbruce.assessment3;

public class User {
    //Private attributes
    private String firstName;
    private String lastName;
    private String username;
    private String password;

    // default constructor
    public User(){
        firstName = "";
        lastName = "";
        username = "";
        password = "";
    }

    // overloaded constructor
    public User(String firstName, String lastName, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
    }

    //Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    //Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUsername(String username) {this.username = username;}

    public void setPassword(String password) {
        this.password = password;
    }
}
