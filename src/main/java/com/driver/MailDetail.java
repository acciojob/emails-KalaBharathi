package com.driver;

import java.util.Date;

public class MailDetail {
    Date date;
    String sender;
    String message;

    public MailDetail(Date date, String sender, String message) {
        this.date = date;
        this.sender = sender;
        this.message = message;
    }
}
