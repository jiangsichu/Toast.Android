package com.jiangsichu.toast.models;

import java.util.Date;
import java.util.List;

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

}
