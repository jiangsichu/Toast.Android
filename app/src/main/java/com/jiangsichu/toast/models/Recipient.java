package com.jiangsichu.toast.models;

public interface Recipient {

    String getText();

}

class UserRecipient implements Recipient {

    public User user;

    public String getText() {
        return user == null ? null : user.userName;
    }
}

class TextRecipient implements Recipient {

    public String text;

    public String getText() {
        return text;
    }

}