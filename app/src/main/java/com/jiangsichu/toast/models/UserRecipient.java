package com.jiangsichu.toast.models;

public class UserRecipient extends User implements Recipient {

    @Override
    public String toString() {
        return userName;
    }
}