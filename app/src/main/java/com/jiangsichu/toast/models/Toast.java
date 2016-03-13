package com.jiangsichu.toast.models;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Toast {

    public User sender;
    public List<Recipient> recipients;
    public String message;
    public Date utcTimeStamp;

    public Toast(User sender, List<Recipient> recipients, String message, Date utcTimeStamp) {
        this.sender = sender;
        this.recipients = recipients;
        this.message = message;
        this.utcTimeStamp = utcTimeStamp;
    }

    public String getRecipientsString() {
        String recipientStr = "";
        for (Recipient recipient : recipients) {
            recipientStr += (recipientStr.isEmpty() ? "" : ", ") + recipient.toString();
        }
        return recipientStr;
    }

}
