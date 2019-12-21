package com.haanhgs.app.mvptextwatcherdemo.model;

import androidx.annotation.NonNull;

public class User {

    private String name = "";
    private String email = "";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @NonNull
    @Override
    public String toString() {
        return "Name: " + name + "\nEmail: " + email;
    }
}
