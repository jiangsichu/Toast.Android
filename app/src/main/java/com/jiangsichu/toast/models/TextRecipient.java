package com.jiangsichu.toast.models;

public class TextRecipient implements Recipient {

    public String text;

    public TextRecipient(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
