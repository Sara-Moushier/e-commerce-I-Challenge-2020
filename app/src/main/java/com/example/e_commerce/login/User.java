package com.example.e_commerce.login;

public class User {

    private String username,password,userEmail;
    public static final String PREFERENCE_NAME = "com.example.sessionsix";
    public static final String REMEMBER_ME = "remember_me";
    private int id;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
