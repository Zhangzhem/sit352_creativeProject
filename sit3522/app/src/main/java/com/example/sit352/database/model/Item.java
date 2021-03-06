package com.example.sit352.database.model;

public class Item {
    private int id;
    private String title;
    private String email;
    private String password;
    private String description;

    public Item(String title, String email, String password, String description) {
        this.title = title;
        this.email = email;
        this.password = password;
        this.description = description;
    }

    public Item(int id, String title, String email, String password, String description) {
        this.id = id;
        this.title = title;
        this.email = email;
        this.password = password;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
