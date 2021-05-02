package com.ersozyazilim.logSystem;

public class SmsLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println(message+" Işlem Sms olarak gönderildi.");
    }
}
