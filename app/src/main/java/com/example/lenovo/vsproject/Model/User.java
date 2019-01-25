package com.example.lenovo.vsproject.Model;

public class User {

    private int id;
    private String username, email;

    public User(int id,String username, String email) {
        this.username = username;
        this.email = email;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}