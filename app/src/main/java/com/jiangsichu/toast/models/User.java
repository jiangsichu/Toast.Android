package com.jiangsichu.toast.models;

public class User {

    public String userName;
    public String fullName;
    public String email;
    public String imgUrl;

    public User() {}

    public User(String userName, String fullName, String email, String imgUrl) {
        this.userName = userName;
        this.fullName = fullName;
        this.email = email;
        this.imgUrl = imgUrl;
    }

    public static User NewForEmail(String email) {
        String name = email.split("@")[0];
        return new User(name, name, email, null);
    }

}
